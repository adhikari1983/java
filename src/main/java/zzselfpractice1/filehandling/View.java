/**
 /*
 *      Objects in java / data are stored in the memory and the memory is volatile.
 *      So, before the so-called evaporation happens we want to store the data in our
 *      devices, in the form of FILE or DATABASE.
 *      (%%%% Stream is a logical handle to
 *       A) an input source from which we can read the data e.g. xls sheet
 *       B) or out source to which we can write data e.g. File system, Network
 *
 *      1.ByteStream            --> to read binary
 *      2.CharacterStream       --> to read textual information
 *      3.BufferStream          --> to read all -->wrapper fpr ByteStream & CharacterStream
 *      4.ObjectStream          --> to read objects %%%%)
 *
 *                                      JAVA object / DATA
 *                                           |
 *                 Read the file                         Write to the database
 *                        |                                        |
 *                 input stream                               output stream
 *                        |---------java.io(package)---------------|
 *                                             |
 *                     ________________________|_________________________
 *                     |                                                |
 *                Byte based                                      Char based
 *               1 byte                                           1 char = 2 byte
 *              ASCII - 256 ->  letters               UNICODE - 65535 -> International letters
 *                         |                                                |
 *       InputStream            OutPutStream                     Reader                Writer      (abstract classes)
 *           |                      |                             |                       |
 * FileInputStream          FileOutPutStream                FileReader               FileWriter
 *
 *  */
