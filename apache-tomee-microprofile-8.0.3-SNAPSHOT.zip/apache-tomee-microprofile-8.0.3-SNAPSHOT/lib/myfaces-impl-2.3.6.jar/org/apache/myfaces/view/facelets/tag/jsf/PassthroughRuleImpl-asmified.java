package asm.org.apache.myfaces.view.facelets.tag.jsf;
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
public class PassthroughRuleImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/myfaces/view/facelets/tag/jsf/PassthroughRuleImpl", null, "javax/faces/view/facelets/MetaRule", new String[] { "org/apache/myfaces/view/facelets/PassthroughRule" });

classWriter.visitInnerClass("org/apache/myfaces/view/facelets/tag/jsf/PassthroughRuleImpl$ValueExpressionMetadata", "org/apache/myfaces/view/facelets/tag/jsf/PassthroughRuleImpl", "ValueExpressionMetadata", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/myfaces/view/facelets/tag/jsf/PassthroughRuleImpl$LiteralAttributeMetadata", "org/apache/myfaces/view/facelets/tag/jsf/PassthroughRuleImpl", "LiteralAttributeMetadata", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANCE", "Lorg/apache/myfaces/view/facelets/tag/jsf/PassthroughRuleImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/view/facelets/MetaRule", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "applyRule", "(Ljava/lang/String;Ljavax/faces/view/facelets/TagAttribute;Ljavax/faces/view/facelets/MetadataTarget;)Ljavax/faces/view/facelets/Metadata;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/component/UIComponent;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/MetadataTarget", "isTargetInstanceOf", "(Ljava/lang/Class;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/TagAttribute", "isLiteral", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/MetadataTarget", "getPropertyType", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitLdcInsn("class");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/tag/jsf/PassthroughRuleImpl$ValueExpressionMetadata");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/tag/jsf/PassthroughRuleImpl$ValueExpressionMetadata", "<init>", "(Ljava/lang/String;Ljava/lang/Class;Ljavax/faces/view/facelets/TagAttribute;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/tag/jsf/PassthroughRuleImpl$LiteralAttributeMetadata");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/facelets/TagAttribute", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/tag/jsf/PassthroughRuleImpl$LiteralAttributeMetadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/tag/jsf/PassthroughRuleImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/tag/jsf/PassthroughRuleImpl", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/tag/jsf/PassthroughRuleImpl", "INSTANCE", "Lorg/apache/myfaces/view/facelets/tag/jsf/PassthroughRuleImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
