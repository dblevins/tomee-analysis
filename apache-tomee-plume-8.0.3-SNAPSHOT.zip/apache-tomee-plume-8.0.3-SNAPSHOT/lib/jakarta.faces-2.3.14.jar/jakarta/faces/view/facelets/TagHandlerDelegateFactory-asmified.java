package asm.jakarta.faces.view.facelets;
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
public class TagHandlerDelegateFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "jakarta/faces/view/facelets/TagHandlerDelegateFactory", "Ljava/lang/Object;Ljakarta/faces/FacesWrapper<Ljakarta/faces/view/facelets/TagHandlerDelegateFactory;>;", "java/lang/Object", new String[] { "jakarta/faces/FacesWrapper" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "wrapped", "Ljakarta/faces/view/facelets/TagHandlerDelegateFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "<init>", "()V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/faces/view/facelets/TagHandlerDelegateFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/view/facelets/TagHandlerDelegateFactory", "wrapped", "Ljakarta/faces/view/facelets/TagHandlerDelegateFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrapped", "()Ljakarta/faces/view/facelets/TagHandlerDelegateFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/view/facelets/TagHandlerDelegateFactory", "wrapped", "Ljakarta/faces/view/facelets/TagHandlerDelegateFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createComponentHandlerDelegate", "(Ljakarta/faces/view/facelets/ComponentHandler;)Ljakarta/faces/view/facelets/TagHandlerDelegate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createValidatorHandlerDelegate", "(Ljakarta/faces/view/facelets/ValidatorHandler;)Ljakarta/faces/view/facelets/TagHandlerDelegate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createConverterHandlerDelegate", "(Ljakarta/faces/view/facelets/ConverterHandler;)Ljakarta/faces/view/facelets/TagHandlerDelegate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createBehaviorHandlerDelegate", "(Ljakarta/faces/view/facelets/BehaviorHandler;)Ljakarta/faces/view/facelets/TagHandlerDelegate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getWrapped", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/TagHandlerDelegateFactory", "getWrapped", "()Ljakarta/faces/view/facelets/TagHandlerDelegateFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
