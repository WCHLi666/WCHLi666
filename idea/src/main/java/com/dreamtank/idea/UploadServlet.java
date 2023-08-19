package com.dreamtank.idea;

import jakarta.servlet.http.HttpServlet;

import java.io.FileOutputStream;
import java.util.List;

public class UploadServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
            ServletFileUpload fileUpload = new ServletFileUpload(diskFileItemFactory);
            List<FIleItem> list = fileUpload.parseRequest(request);
            for (FileItem fileItem : list) {
                if (fileItem.isFormField()) {
                    String name = fileItem.getFieldName();
                    String value = fileItem.getString("UTF-8");
                    System.out.println(name + "   " + value);
                } else {
                    String filename = fileItem.getName();
                    InputStream is = fileItem.getInputStream();
                    String realPath = getServletContext().getRealPath("/upload");
                    OutputStream os = new FileOutputStream(realPath + "/" + filename);
                    int len = 0;
                    byte[] b = new byte[1024];
                    while ((len = is.read(b)) ! = -1){
                        os.write(b, 0, len);
                    }
                    is.close();
                    os.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
