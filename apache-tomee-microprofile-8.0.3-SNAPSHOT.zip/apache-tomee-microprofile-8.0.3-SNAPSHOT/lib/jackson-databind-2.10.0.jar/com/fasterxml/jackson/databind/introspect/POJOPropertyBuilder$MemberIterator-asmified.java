package asm.com.fasterxml.jackson.databind.introspect;
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
public class POJOPropertyBuilder$MemberIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$MemberIterator", "<T:Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;>Ljava/lang/Object;Ljava/util/Iterator<TT;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$Linked", "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder", "Linked", ACC_PROTECTED | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$MemberIterator", "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder", "MemberIterator", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "next", "Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$Linked;", "Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$Linked<TT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$Linked;)V", "(Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$Linked<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$MemberIterator", "next", "Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$Linked;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$MemberIterator", "next", "Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$Linked;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", "()TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$MemberIterator", "next", "Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$Linked;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$MemberIterator", "next", "Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$Linked;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$Linked", "value", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/introspect/AnnotatedMember");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$MemberIterator", "next", "Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$Linked;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$Linked", "next", "Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$Linked;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$MemberIterator", "next", "Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$Linked;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$MemberIterator", "next", "()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
