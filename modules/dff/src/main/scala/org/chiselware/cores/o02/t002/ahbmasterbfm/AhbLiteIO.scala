class AhbLiteIO(addrWidth: Int, dataWidth: Int) extends Bundle{
    val haddr = Output(UInt(addrWidth.W))
    val htrans = Output(UInt(2.W))
    val hwrite    = Output(Bool())
    val hsize     = Output(UInt(3.W))
    val hburst    = Output(UInt(3.W))
    val hprot     = Output(UInt(4.W))
    val hmastlock = Output(Bool())
    val hwdata    = Output(UInt(dataWidth.W))
    val hrdata    = Input(UInt(dataWidth.W))
    val hready    = Input(Bool())
    val hresp     = Input(Bool())
}

/** HTRANS encodings, Arm IHI 0033C Table 3-1. */
object HTrans {
  val IDLE   = 0.U(2.W)
  val BUSY   = 1.U(2.W)
  val NONSEQ = 2.U(2.W)
  val SEQ    = 3.U(2.W)
}

/** HBURST encodings, Arm IHI 0033C Table 3-4. */
object HBurst {
  val SINGLE = 0.U(3.W)
  val INCR   = 1.U(3.W)
  val WRAP4  = 2.U(3.W)
  val INCR4  = 3.U(3.W)
  val WRAP8  = 4.U(3.W)
  val INCR8  = 5.U(3.W)
  val WRAP16 = 6.U(3.W)
  val INCR16 = 7.U(3.W)
}

