package asm.com.sun.faces.application.view;
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
public class FaceletViewHandlingStrategy$MethodRetargetHandlerManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "com/sun/faces/application/view/FaceletViewHandlingStrategy", "MethodRetargetHandlerManager", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ArbitraryMethodRegargetHandler", "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "ArbitraryMethodRegargetHandler", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ValueChangeListenerRegargetHandler", "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "ValueChangeListenerRegargetHandler", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ValidatorRegargetHandler", "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "ValidatorRegargetHandler", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ActionListenerRegargetHandler", "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "ActionListenerRegargetHandler", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ActionRegargetHandler", "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "ActionRegargetHandler", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$AbstractRetargetHandler", "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "AbstractRetargetHandler", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler", "com/sun/faces/application/view/FaceletViewHandlingStrategy", "MethodRetargetHandler", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("com/sun/faces/application/view/FaceletViewHandlingStrategy$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "handlerMap", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "arbitraryHandler", "Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(FCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(IF)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "handlerMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ArbitraryMethodRegargetHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ArbitraryMethodRegargetHandler", "<init>", "(Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$1;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "arbitraryHandler", "Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ActionRegargetHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ActionRegargetHandler", "<init>", "(Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ActionListenerRegargetHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ActionListenerRegargetHandler", "<init>", "(Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ValidatorRegargetHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ValidatorRegargetHandler", "<init>", "(Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ValueChangeListenerRegargetHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager$ValueChangeListenerRegargetHandler", "<init>", "(Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$1;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "[Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler;", "[Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "handlerMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler", "getAttribute", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getRetargetHandler", "(Ljava/lang/String;)Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "handlerMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getDefaultHandler", "()Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "arbitraryHandler", "Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager;Ljava/lang/String;)Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "getRetargetHandler", "(Ljava/lang/String;)Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager;)Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandlerManager", "getDefaultHandler", "()Lcom/sun/faces/application/view/FaceletViewHandlingStrategy$MethodRetargetHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
