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
public class ActionSourceRule$ActionMapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionMapper", null, "jakarta/faces/view/facelets/Metadata", null);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionMapper", "com/sun/faces/facelets/tag/jsf/ActionSourceRule", "ActionMapper", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "attr", "Ljakarta/faces/view/facelets/TagAttribute;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/faces/view/facelets/TagAttribute;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/view/facelets/Metadata", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionMapper", "attr", "Ljakarta/faces/view/facelets/TagAttribute;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "applyMetadata", "(Ljakarta/faces/view/facelets/FaceletContext;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/ActionSource");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/el/LegacyMethodBinding");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ActionSourceRule$ActionMapper", "attr", "Ljakarta/faces/view/facelets/TagAttribute;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/jsf/ActionSourceRule", "ACTION_SIG", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/TagAttribute", "getMethodExpression", "(Ljakarta/faces/view/facelets/FaceletContext;Ljava/lang/Class;[Ljava/lang/Class;)Ljakarta/el/MethodExpression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/el/LegacyMethodBinding", "<init>", "(Ljakarta/el/MethodExpression;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/ActionSource", "setAction", "(Ljakarta/faces/el/MethodBinding;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
