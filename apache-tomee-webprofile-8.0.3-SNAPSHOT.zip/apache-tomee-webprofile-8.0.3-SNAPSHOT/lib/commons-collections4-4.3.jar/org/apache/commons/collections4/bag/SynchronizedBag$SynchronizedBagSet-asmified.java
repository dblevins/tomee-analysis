package asm.org.apache.commons.collections4.bag;
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
public class SynchronizedBag$SynchronizedBagSetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/commons/collections4/bag/SynchronizedBag$SynchronizedBagSet", "Lorg/apache/commons/collections4/collection/SynchronizedCollection<TE;>;Ljava/util/Set<TE;>;", "org/apache/commons/collections4/collection/SynchronizedCollection", new String[] { "java/util/Set" });

classWriter.visitInnerClass("org/apache/commons/collections4/bag/SynchronizedBag$SynchronizedBagSet", "org/apache/commons/collections4/bag/SynchronizedBag", "SynchronizedBagSet", 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(2990565892366827855L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections4/bag/SynchronizedBag;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections4/bag/SynchronizedBag;Ljava/util/Set;Ljava/lang/Object;)V", "(Ljava/util/Set<TE;>;Ljava/lang/Object;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bag/SynchronizedBag$SynchronizedBagSet", "this$0", "Lorg/apache/commons/collections4/bag/SynchronizedBag;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/collection/SynchronizedCollection", "<init>", "(Ljava/util/Collection;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
