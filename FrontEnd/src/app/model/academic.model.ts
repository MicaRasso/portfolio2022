export class academic{
    id?:number;
    title:string;
    iDate:Date;
    fDate:Date;
    id_institute:number;

    constructor(title:string,iDate:Date,fDate:Date,id_institute:number){
        this.title=title;
        this.iDate=iDate;
        this.fDate=fDate;
        this.id_institute=id_institute;
     }

}