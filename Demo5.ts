// // // // // // // let count : number ;
// // // // // // // count = 123;
// // // // // // // let countInference = 123

// // // // // // const one = 1;
// // // // // // const two = 2;
// // // // // // const three = one + two;

// // // // // function getTotal(one : number, two : number){
// // // // //     return one + two
// // // // // }
// // // // // const total = getTotal(1,2)

// // // // // const XiaoJieJie = {
// // // // //     name:'刘英',
// // // // //     age:18
// // // // // }

// // // // function getTotal(one : number , two : number){
// // // //     return one + two
// // // // }
// // // // const total = getTotal(1,2)

// // // function sayHello() : void{
// // //     console.log('Hello World')   
// // // }

// // function errorFunction() : never{
// //     throw new Error()
// //     console.log('Hello World')
// // }

// // function forNever() : never{
// //     while(true){}
// //     console.log('Hello World')
// // }

// function add({one ,two} : {one : number ,two : number}){
//     return one + two
// }

// const total = add({one:1,two:2})

function getNumber({one} : {one : number}){
    return one
}

const one = getNumber({one:1})