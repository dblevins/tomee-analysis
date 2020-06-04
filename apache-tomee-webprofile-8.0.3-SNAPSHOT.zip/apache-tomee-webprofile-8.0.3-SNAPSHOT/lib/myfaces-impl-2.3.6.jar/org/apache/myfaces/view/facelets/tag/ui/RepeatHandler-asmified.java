package asm.org.apache.myfaces.view.facelets.tag.ui;
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
public class RepeatHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/view/facelets/tag/ui/RepeatHandler", null, "javax/faces/view/facelets/ComponentHandler", null);

classWriter.visitInnerClass("org/apache/myfaces/view/facelets/tag/ui/RepeatHandler$TagMetaData", "org/apache/myfaces/view/facelets/tag/ui/RepeatHandler", "TagMetaData", ACC_PRIVATE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/faces/view/facelets/ComponentConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/view/facelets/ComponentHandler", "<init>", "(Ljavax/faces/view/facelets/ComponentConfig;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createMetaRuleset", "(Ljava/lang/Class;)Ljavax/faces/view/facelets/MetaRuleset;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/view/facelets/ComponentHandler", "createMetaRuleset", "(Ljava/lang/Class;)Ljavax/faces/view/facelets/MetaRuleset;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/jsf/facelets");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/ui/RepeatHandler", "tag", "Ljavax/faces/view/facelets/Tag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/Tag", "getNamespace", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("http://java.sun.com/jsf/facelets");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/ui/RepeatHandler", "tag", "Ljavax/faces/view/facelets/Tag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/Tag", "getNamespace", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/tag/ui/RepeatHandler$TagMetaData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/tag/ui/RepeatHandler$TagMetaData", "<init>", "(Lorg/apache/myfaces/view/facelets/tag/ui/RepeatHandler;Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/MetaRuleset", "add", "(Ljavax/faces/view/facelets/Metadata;)Ljavax/faces/view/facelets/MetaRuleset;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/faces/view/facelets/MetaRuleset"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("class");
methodVisitor.visitLdcInsn("styleClass");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/MetaRuleset", "alias", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/faces/view/facelets/MetaRuleset;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/myfaces/view/facelets/tag/ui/RepeatHandler;)Ljavax/faces/view/facelets/Tag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/ui/RepeatHandler", "tag", "Ljavax/faces/view/facelets/Tag;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/myfaces/view/facelets/tag/ui/RepeatHandler;)Ljavax/faces/view/facelets/Tag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/tag/ui/RepeatHandler", "tag", "Ljavax/faces/view/facelets/Tag;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
