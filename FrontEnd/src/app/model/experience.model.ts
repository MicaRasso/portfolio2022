export class experience{
    id?:number;
    title:string;
    iDate:Date;
    fDate:Date;
    description:string;
    company:string;

    constructor(title:string,iDate:Date,fDate:Date,description:string,company:string){
        this.title=title;
        this.iDate=iDate;
        this.fDate=fDate;
        this.description=description;
        this.company=company;
     }

}