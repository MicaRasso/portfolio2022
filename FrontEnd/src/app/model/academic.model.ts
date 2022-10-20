export class academic{
    id?:number;
    title:string;
    iDate:Date;
    fDate:Date;
    institute:string;

    constructor(title:string,iDate:Date,fDate:Date,institute:string){
        this.title=title;
        this.iDate=iDate;
        this.fDate=fDate;
        this.institute=institute;
     }

}