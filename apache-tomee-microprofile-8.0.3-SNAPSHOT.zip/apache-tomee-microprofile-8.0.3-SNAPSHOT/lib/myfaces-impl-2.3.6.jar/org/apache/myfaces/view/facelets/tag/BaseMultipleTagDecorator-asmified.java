package asm.org.apache.myfaces.view.facelets.tag;
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
public class BaseMultipleTagDecoratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/view/facelets/tag/BaseMultipleTagDecorator", null, "java/lang/Object", new String[] { "javax/faces/view/facelets/TagDecorator" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "defaultTagDecorator", "Ljavax/faces/view/facelets/TagDecorator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "compositeTagDecorator", "Ljavax/faces/view/facelets/TagDecorator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/faces/view/facelets/TagDecorator;Ljavax/faces/view/facelets/TagDecorator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/tag/BaseMultipleTagDecorator", "defaultTagDecorator", "Ljavax/faces/view/facelets/TagDecorator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/tag/BaseMultipleTagDecorator", "compositeTagDecorator", "Ljavax/faces/view/facelets/TagDecorator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "decorate", "(Ljavax/faces/view/facelets/Tag;)Ljavax/faces/view/facelets/Tag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/BaseMultipleTagDecorator", "defaultTagDecorator", "Ljavax/faces/view/facelets/TagDecorator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/view/facelets/TagDecorator", "decorate", "(Ljavax/faces/view/facelets/Tag;)Ljavax/faces/view/facelets/Tag;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/BaseMultipleTagDecorator", "compositeTagDecorator", "Ljavax/faces/view/facelets/TagDecorator;");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/myfaces/view/facelets/tag/BaseMultipleTagDecorator", "javax/faces/view/facelets/Tag", "javax/faces/view/facelets/Tag"}, 1, new Object[] {"javax/faces/view/facelets/TagDecorator"});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/myfaces/view/facelets/tag/BaseMultipleTagDecorator", "javax/faces/view/facelets/Tag", "javax/faces/view/facelets/Tag"}, 2, new Object[] {"javax/faces/view/facelets/TagDecorator", "javax/faces/view/facelets/Tag"});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/view/facelets/TagDecorator", "decorate", "(Ljavax/faces/view/facelets/Tag;)Ljavax/faces/view/facelets/Tag;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
