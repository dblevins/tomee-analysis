package asm.org.apache.openejb.client;
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
public class RoundRobinConnectionStrategy$RoundRobinIterable$RoundRobinIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable$RoundRobinIterator", "Ljava/lang/Object;Ljava/util/Iterator<Ljava/net/URI;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable", "org/apache/openejb/client/RoundRobinConnectionStrategy", "RoundRobinIterable", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable$RoundRobinIterator", "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable", "RoundRobinIterator", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/client/RoundRobinConnectionStrategy$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "seen", "Ljava/util/Set;", "Ljava/util/Set<Ljava/net/URI;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable$RoundRobinIterator", "this$0", "Lorg/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable$RoundRobinIterator", "seen", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable$RoundRobinIterator", "seen", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "size", "()I", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable$RoundRobinIterator", "this$0", "Lorg/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable", "access$100", "(Lorg/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable;)[Ljava/net/URI;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/net/URI;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable$RoundRobinIterator", "hasNext", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable$RoundRobinIterator", "this$0", "Lorg/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable", "access$100", "(Lorg/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable;)[Ljava/net/URI;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable$RoundRobinIterator", "this$0", "Lorg/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable", "access$200", "(Lorg/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable;)I", false);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable$RoundRobinIterator", "seen", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable$RoundRobinIterator", "next", "()Ljava/net/URI;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable;Lorg/apache/openejb/client/RoundRobinConnectionStrategy$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable$RoundRobinIterator", "<init>", "(Lorg/apache/openejb/client/RoundRobinConnectionStrategy$RoundRobinIterable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
