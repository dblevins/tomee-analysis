package asm.javax.servlet.jsp.el;
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
public class ImplicitObjectELResolver$ScopeManager$10Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$10", "Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeMap<Ljava/lang/Object;>;", "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeMap", null);

classWriter.visitOuterClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "getSessionScope", "()Ljava/util/Map;");

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "javax/servlet/jsp/el/ImplicitObjectELResolver", "ScopeManager", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$10", null, null, 0);

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeMap", "javax/servlet/jsp/el/ImplicitObjectELResolver", "ScopeMap", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$10", "this$0", "Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeMap", "<init>", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$10", "this$0", "Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "access$100", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)Ljavax/servlet/jsp/PageContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "getRequest", "()Ljavax/servlet/ServletRequest;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/servlet/http/HttpServletRequest");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getSession", "()Ljavax/servlet/http/HttpSession;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpSession", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "removeAttribute", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$10", "this$0", "Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "access$100", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)Ljavax/servlet/jsp/PageContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "getSession", "()Ljavax/servlet/http/HttpSession;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpSession", "removeAttribute", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/servlet/http/HttpSession"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getAttributeNames", "()Ljava/util/Enumeration;", "()Ljava/util/Enumeration<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$10", "this$0", "Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "access$100", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)Ljavax/servlet/jsp/PageContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "getSession", "()Ljavax/servlet/http/HttpSession;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpSession", "getAttributeNames", "()Ljava/util/Enumeration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/servlet/http/HttpSession"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$10", "this$0", "Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "access$100", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)Ljavax/servlet/jsp/PageContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "getSession", "()Ljavax/servlet/http/HttpSession;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpSession", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/servlet/http/HttpSession"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
