package pacote

import net.fwbrasil.activate.ActivateContext
import net.fwbrasil.activate.storage.memory.MemoryStorage


object testContext extends ActivateContext {
    def contextName = "memoryContext"
    val storage = new MemoryStorage    
}


object Test01 {
  
  def main(args: Array[String]): Unit = {
     System.out.print(testContext)
  }

}