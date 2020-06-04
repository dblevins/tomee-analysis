package asm.org.apache.geronimo.transaction.manager;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class TransactionLogDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/geronimo/transaction/manager/TransactionLog", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/geronimo/transaction/manager/Recovery$XidBranchesPair", "org/apache/geronimo/transaction/manager/Recovery", "XidBranchesPair", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "begin", "(Ljavax/transaction/xa/Xid;)V", null, new String[] { "org/apache/geronimo/transaction/manager/LogException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "prepare", "(Ljavax/transaction/xa/Xid;Ljava/util/List;)Ljava/lang/Object;", "(Ljavax/transaction/xa/Xid;Ljava/util/List<+Lorg/apache/geronimo/transaction/manager/TransactionBranchInfo;>;)Ljava/lang/Object;", new String[] { "org/apache/geronimo/transaction/manager/LogException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "commit", "(Ljavax/transaction/xa/Xid;Ljava/lang/Object;)V", null, new String[] { "org/apache/geronimo/transaction/manager/LogException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "rollback", "(Ljavax/transaction/xa/Xid;Ljava/lang/Object;)V", null, new String[] { "org/apache/geronimo/transaction/manager/LogException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "recover", "(Lorg/apache/geronimo/transaction/manager/XidFactory;)Ljava/util/Collection;", "(Lorg/apache/geronimo/transaction/manager/XidFactory;)Ljava/util/Collection<Lorg/apache/geronimo/transaction/manager/Recovery$XidBranchesPair;>;", new String[] { "org/apache/geronimo/transaction/manager/LogException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getXMLStats", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAverageForceTime", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAverageBytesPerForce", "()I", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
