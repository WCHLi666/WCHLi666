interface Girl{
    name: string;
}

class SelectGirl<T extends Girl>{
    constructor(private girls: T[]){}
    getGirl(index:number):string{
        return this.girls[index].name;
    }
}
const selectGirl = new SelectGirl([
    {name:"大脚"},
    {name:"刘英"},
    {name:"晓红"},
    ]);
console.log(selectGirl.getGirl(1));