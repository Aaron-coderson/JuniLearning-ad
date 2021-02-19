class Main implements Runnable{
    //   public static void main(String[] args) {
    //     HourClock standard = new HourClock(false);
    //     
    //     HourClock military = new HourClock(true);
    //     Thread t = null;
    //     
    //     //     for(int i = 0; i<=20; i++)
    //     //     {
    //     //      standard.tick();
    //     //      standard.displayTime();
    //     //     }
    //     //    //https://pastebin.com/KrLFdyJw
    //     // https://pastebin.com/KrLFdyJwhttps://pastebin.com/KrLFdyJw
    //     // https://pastebin.com/KrLFdyJw
    //     // https://pastebin.com/KrLFdyJw
    //     // https://pastebin.com/KrLFdyJw
    //     
    //     
    //     
    //   }
    Thread t = null;
    mClock standard = new mClock();
    public void start()
    {
        t = new Thread(this);
        t.start();
        
    }
    public void run()
    {
//         while(true)    
//         {
//             standard.tick();
//             standard.displayTime();
//             try {Thread.sleep(1000);} // input whatever amount of time you want
//             catch(Exception e) {}
//             
//         }
        while(true)    
        {
            standard.ticki();
            standard.displayTime();
            try {Thread.sleep(1000);} // input whatever amount of time you want
            catch(Exception e) {}
            
        }
}
}