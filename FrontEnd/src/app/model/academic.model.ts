export class academic{
    id?:number;
    title:string;
    iDate:string;
    fDate:string;
    institute:string;

    constructor(title:string,iDate:string,fDate:string,institute:string){
        this.title=title;
        this.iDate=iDate;
        this.fDate=fDate;
        this.institute=institute;
     }

}