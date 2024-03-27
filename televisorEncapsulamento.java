public class TelevisorEncapsula {
    private int volume;
    private int canal;
    
    public void aumentarVolume() {
        if(volume < 100){
            volume ++
        }
    }
    
    public void diminuirVolume(){
        if(volume > 0){
            volume--;
        }
    }
    
    public void aumentarCanal(){
        if(canal < 1000){
            canal++;
        }
    }
    
    public void diminuirCanal(){
        if(canal > 0){
            canal--;
        }
    }
    
    public void mostrar(){
        System.out.println("volume:"+getVolume()+"\nCanal:"+getCanal());
    }
    
    public int getVolume(){
        return volume;
    }
    
    public int getCanal(){
        return canal;
    }
    
    public void setVolume(int volume) {
        try{
            if(volume >= 0 && volume <= 100) {
                this.volume = volume;
            }else{
                throw new exception("Volume fora da faixa permitida");
            }
        }catch (Exception erro){
            System.out.println(erro.getMessage());
        };
    }
    
    public void setCanal(int canal) {
        if(canal >=0 && canal <= 100){
            this.canal = canal;
        }
    }
}