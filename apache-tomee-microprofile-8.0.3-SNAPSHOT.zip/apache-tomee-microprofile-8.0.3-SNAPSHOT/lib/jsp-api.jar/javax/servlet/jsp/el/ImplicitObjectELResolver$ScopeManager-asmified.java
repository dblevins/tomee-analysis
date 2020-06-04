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
public class ImplicitObjectELResolver$ScopeManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", null, "java/lang/Object", null);

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "javax/servlet/jsp/el/ImplicitObjectELResolver", "ScopeManager", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$10", null, null, 0);

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$9", null, null, 0);

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$8", null, null, 0);

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$7", null, null, 0);

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$6", null, null, 0);

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$5", null, null, 0);

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$4", null, null, 0);

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$3", null, null, 0);

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$2", null, null, 0);

classWriter.visitInnerClass("javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MNGR_KEY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "page", "Ljavax/servlet/jsp/PageContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "applicationScope", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cookie", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljavax/servlet/http/Cookie;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "header", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "headerValues", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;[Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "initParam", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "pageScope", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "param", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "paramValues", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;[Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "requestScope", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sessionScope", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/servlet/jsp/PageContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "page", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "get", "(Ljavax/servlet/jsp/PageContext;)Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "MNGR_KEY", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "<init>", "(Ljavax/servlet/jsp/PageContext;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "MNGR_KEY", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getApplicationScope", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "applicationScope", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$1", "<init>", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "applicationScope", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "applicationScope", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCookie", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljavax/servlet/http/Cookie;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "cookie", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$2", "<init>", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "cookie", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "cookie", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHeader", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "header", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$3", "<init>", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "header", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "header", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHeaderValues", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;[Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "headerValues", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$4", "<init>", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "headerValues", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "headerValues", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInitParam", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "initParam", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$5", "<init>", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "initParam", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "initParam", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPageContext", "()Ljavax/servlet/jsp/PageContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "page", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPageScope", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "pageScope", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$6");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$6", "<init>", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "pageScope", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "pageScope", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParam", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "param", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$7");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$7", "<init>", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "param", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "param", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParamValues", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;[Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "paramValues", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$8");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$8", "<init>", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "paramValues", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "paramValues", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRequestScope", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "requestScope", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$9");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$9", "<init>", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "requestScope", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "requestScope", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSessionScope", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "sessionScope", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$10");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager$10", "<init>", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "sessionScope", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "sessionScope", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;)Ljavax/servlet/jsp/PageContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "page", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/servlet/jsp/el/ImplicitObjectELResolver$ScopeManager", "MNGR_KEY", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
