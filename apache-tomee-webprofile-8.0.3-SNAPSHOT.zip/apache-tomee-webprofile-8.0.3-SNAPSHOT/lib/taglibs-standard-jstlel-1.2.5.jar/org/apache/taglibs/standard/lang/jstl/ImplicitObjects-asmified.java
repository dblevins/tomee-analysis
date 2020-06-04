package asm.org.apache.taglibs.standard.lang.jstl;
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
public class ImplicitObjectsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/taglibs/standard/lang/jstl/ImplicitObjects$9", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/taglibs/standard/lang/jstl/ImplicitObjects$8", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/taglibs/standard/lang/jstl/ImplicitObjects$7", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/taglibs/standard/lang/jstl/ImplicitObjects$6", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/taglibs/standard/lang/jstl/ImplicitObjects$5", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/taglibs/standard/lang/jstl/ImplicitObjects$4", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/taglibs/standard/lang/jstl/ImplicitObjects$3", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/taglibs/standard/lang/jstl/ImplicitObjects$2", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/taglibs/standard/lang/jstl/ImplicitObjects$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "sAttributeName", "Ljava/lang/String;", null, "org.apache.taglibs.standard.ImplicitObjects");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mContext", "Ljavax/servlet/jsp/PageContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mPage", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mRequest", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mSession", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mApplication", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mParam", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mParams", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mHeader", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mHeaders", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mInitParam", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mCookie", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/servlet/jsp/PageContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mContext", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getImplicitObjects", "(Ljavax/servlet/jsp/PageContext;)Lorg/apache/taglibs/standard/lang/jstl/ImplicitObjects;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("org.apache.taglibs.standard.ImplicitObjects");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "getAttribute", "(Ljava/lang/String;I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "<init>", "(Ljavax/servlet/jsp/PageContext;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("org.apache.taglibs.standard.ImplicitObjects");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;I)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPageScopeMap", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mPage", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mContext", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "createPageScopeMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mPage", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mPage", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRequestScopeMap", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mRequest", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mContext", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "createRequestScopeMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mRequest", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mRequest", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSessionScopeMap", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mSession", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mContext", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "createSessionScopeMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mSession", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mSession", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getApplicationScopeMap", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mApplication", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mContext", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "createApplicationScopeMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mApplication", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mApplication", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParamMap", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mParam", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mContext", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "createParamMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mParam", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mParam", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParamsMap", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mParams", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mContext", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "createParamsMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mParams", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mParams", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHeaderMap", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mHeader", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mContext", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "createHeaderMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mHeader", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mHeader", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHeadersMap", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mHeaders", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mContext", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "createHeadersMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mHeaders", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mHeaders", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInitParamMap", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mInitParam", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mContext", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "createInitParamMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mInitParam", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mInitParam", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCookieMap", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mCookie", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mContext", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "createCookieMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mCookie", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects", "mCookie", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPageScopeMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$1", "<init>", "(Ljavax/servlet/jsp/PageContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createRequestScopeMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$2", "<init>", "(Ljavax/servlet/jsp/PageContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createSessionScopeMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$3", "<init>", "(Ljavax/servlet/jsp/PageContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createApplicationScopeMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$4", "<init>", "(Ljavax/servlet/jsp/PageContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createParamMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "getRequest", "()Ljavax/servlet/ServletRequest;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/servlet/http/HttpServletRequest");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$5", "<init>", "(Ljavax/servlet/http/HttpServletRequest;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createParamsMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "getRequest", "()Ljavax/servlet/ServletRequest;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/servlet/http/HttpServletRequest");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$6");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$6", "<init>", "(Ljavax/servlet/http/HttpServletRequest;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createHeaderMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "getRequest", "()Ljavax/servlet/ServletRequest;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/servlet/http/HttpServletRequest");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$7");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$7", "<init>", "(Ljavax/servlet/http/HttpServletRequest;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createHeadersMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "getRequest", "()Ljavax/servlet/ServletRequest;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/servlet/http/HttpServletRequest");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$8");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$8", "<init>", "(Ljavax/servlet/http/HttpServletRequest;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createInitParamMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "getServletContext", "()Ljavax/servlet/ServletContext;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$9");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/lang/jstl/ImplicitObjects$9", "<init>", "(Ljavax/servlet/ServletContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createCookieMap", "(Ljavax/servlet/jsp/PageContext;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "getRequest", "()Ljavax/servlet/ServletRequest;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/servlet/http/HttpServletRequest");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getCookies", "()[Ljavax/servlet/http/Cookie;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/http/Cookie", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
