public class ModenPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();
    //写信，封装，投递，一体化了
    public void sendLetter(String context,String address){

        //帮你写信
        letterProcess.writeContext(context);
        //写好信封
        letterProcess.fillEnvelope(address);
        //把信放到信封中
        letterProcess.letterInotoEnvelope();
        //邮递信件
        letterProcess.sendLetter();
    }
}