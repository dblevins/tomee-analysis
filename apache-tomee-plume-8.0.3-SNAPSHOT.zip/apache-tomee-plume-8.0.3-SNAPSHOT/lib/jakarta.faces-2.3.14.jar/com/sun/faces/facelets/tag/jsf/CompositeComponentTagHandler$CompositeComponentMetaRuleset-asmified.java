package asm.com.sun.faces.facelets.tag.jsf;
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
public class CompositeComponentTagHandler$CompositeComponentMetaRulesetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentMetaRuleset", null, "com/sun/faces/facelets/tag/MetaRulesetImpl", null);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentMetaRuleset", "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler", "CompositeComponentMetaRuleset", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentMetaRuleset$CompositeMetadataTarget", "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentMetaRuleset", "CompositeMetadataTarget", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "compBeanInfo", "Ljava/beans/BeanInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "type", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/faces/view/facelets/Tag;Ljava/lang/Class;Ljava/beans/BeanInfo;)V", "(Ljakarta/faces/view/facelets/Tag;Ljava/lang/Class<*>;Ljava/beans/BeanInfo;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/MetaRulesetImpl", "<init>", "(Ljakarta/faces/view/facelets/Tag;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentMetaRuleset", "compBeanInfo", "Ljava/beans/BeanInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentMetaRuleset", "type", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getMetadataTarget", "()Ljakarta/faces/view/facelets/MetadataTarget;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/beans/IntrospectionException");
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentMetaRuleset$CompositeMetadataTarget");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentMetaRuleset", "type", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentMetaRuleset", "compBeanInfo", "Ljava/beans/BeanInfo;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler$CompositeComponentMetaRuleset$CompositeMetadataTarget", "<init>", "(Ljava/lang/Class;Ljava/beans/BeanInfo;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/beans/IntrospectionException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/FacesException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/FacesException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
