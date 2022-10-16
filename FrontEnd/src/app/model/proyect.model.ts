export class proyect{
    id?:number;
    title:string;
    fDate:Date;
    description:string;
    id_company:number;

    constructor(title:string,fDate:Date,description:string,id_company:number){
        this.title=title;
        this.fDate=fDate;
        this.description=description;
        this.id_company=id_company;
     }

}