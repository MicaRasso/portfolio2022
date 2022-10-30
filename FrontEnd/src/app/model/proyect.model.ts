
export class proyect{
    id?:number;
    title:string;
    fDate:string;
    description:string;
    link:string;
    img_URL:string;
    company:string;
    

    constructor(title:string,fDate:string,description:string,link:string,img_URL:string,company:string){
        this.title=title;
        this.fDate=fDate;
        this.description=description;
        this.link=link;
        this.img_URL=img_URL;
        this.company=company;
     }

}