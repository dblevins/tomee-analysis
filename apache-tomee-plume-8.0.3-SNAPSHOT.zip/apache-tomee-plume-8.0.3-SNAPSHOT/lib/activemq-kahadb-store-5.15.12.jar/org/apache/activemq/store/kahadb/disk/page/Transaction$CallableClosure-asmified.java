package asm.org.apache.activemq.store.kahadb.disk.page;
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
public class Transaction$CallableClosureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/activemq/store/kahadb/disk/page/Transaction$CallableClosure", "<R:Ljava/lang/Object;T:Ljava/lang/Throwable;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/page/Transaction$CallableClosure", "org/apache/activemq/store/kahadb/disk/page/Transaction", "CallableClosure", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/lang/Object;", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)TR;^TT;", new String[] { "java/lang/Throwable" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
