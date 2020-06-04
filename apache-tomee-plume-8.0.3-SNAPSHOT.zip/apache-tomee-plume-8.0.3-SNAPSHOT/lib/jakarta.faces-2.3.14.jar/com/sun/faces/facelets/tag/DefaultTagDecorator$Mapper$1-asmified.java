package asm.com.sun.faces.facelets.tag;
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
public class DefaultTagDecorator$Mapper$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper$1", null, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", null);

classWriter.visitOuterClass("com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "<init>", "(Ljava/lang/String;I[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;)V");

classWriter.visitInnerClass("com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "com/sun/faces/facelets/tag/DefaultTagDecorator", "ElementConverter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper", "com/sun/faces/facelets/tag/DefaultTagDecorator", "Mapper", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper$1", null, null, 0);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/DefaultTagDecorator$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$elementConverters", "[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper$1", "this$0", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Mapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper$1", "val$elementConverters", "[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "<init>", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "decorate", "(Ljavax/faces/view/facelets/Tag;)Ljavax/faces/view/facelets/Tag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/DefaultTagDecorator$Mapper$1", "val$elementConverters", "[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$ElementConverter", "decorate", "(Ljavax/faces/view/facelets/Tag;)Ljavax/faces/view/facelets/Tag;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
