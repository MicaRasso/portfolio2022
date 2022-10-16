export class experience{
    id?:number;
    title:string;
    iDate:Date;
    fDate:Date;
    description:string;
    id_company:number;

    constructor(title:string,iDate:Date,fDate:Date,description:string,id_company:number){
        this.title=title;
        this.iDate=iDate;
        this.fDate=fDate;
        this.description=description;
        this.id_company=id_company;
     }

}