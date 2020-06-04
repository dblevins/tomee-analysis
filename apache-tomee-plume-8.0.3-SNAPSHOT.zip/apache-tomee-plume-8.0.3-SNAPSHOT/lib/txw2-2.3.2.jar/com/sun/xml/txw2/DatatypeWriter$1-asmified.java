package asm.com.sun.xml.txw2;
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
public class DatatypeWriter$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/txw2/DatatypeWriter$1", null, "java/util/AbstractList", null);

classWriter.visitOuterClass("com/sun/xml/txw2/DatatypeWriter", null, null);

classWriter.visitInnerClass("com/sun/xml/txw2/DatatypeWriter$1", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/txw2/DatatypeWriter$1$5", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/txw2/DatatypeWriter$1$4", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/txw2/DatatypeWriter$1$3", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/txw2/DatatypeWriter$1$2", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/txw2/DatatypeWriter$1$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "BUILTIN_ARRAY", "[Lcom/sun/xml/txw2/DatatypeWriter;", "[Lcom/sun/xml/txw2/DatatypeWriter<*>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/AbstractList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/xml/txw2/DatatypeWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/txw2/DatatypeWriter$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/txw2/DatatypeWriter$1$1", "<init>", "(Lcom/sun/xml/txw2/DatatypeWriter$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/txw2/DatatypeWriter$1$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/txw2/DatatypeWriter$1$2", "<init>", "(Lcom/sun/xml/txw2/DatatypeWriter$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/txw2/DatatypeWriter$1$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/txw2/DatatypeWriter$1$3", "<init>", "(Lcom/sun/xml/txw2/DatatypeWriter$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/txw2/DatatypeWriter$1$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/txw2/DatatypeWriter$1$4", "<init>", "(Lcom/sun/xml/txw2/DatatypeWriter$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/txw2/DatatypeWriter$1$5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/txw2/DatatypeWriter$1$5", "<init>", "(Lcom/sun/xml/txw2/DatatypeWriter$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/txw2/DatatypeWriter$1", "BUILTIN_ARRAY", "[Lcom/sun/xml/txw2/DatatypeWriter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(I)Lcom/sun/xml/txw2/DatatypeWriter;", "(I)Lcom/sun/xml/txw2/DatatypeWriter<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/txw2/DatatypeWriter$1", "BUILTIN_ARRAY", "[Lcom/sun/xml/txw2/DatatypeWriter;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/txw2/DatatypeWriter$1", "BUILTIN_ARRAY", "[Lcom/sun/xml/txw2/DatatypeWriter;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "get", "(I)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/txw2/DatatypeWriter$1", "get", "(I)Lcom/sun/xml/txw2/DatatypeWriter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
