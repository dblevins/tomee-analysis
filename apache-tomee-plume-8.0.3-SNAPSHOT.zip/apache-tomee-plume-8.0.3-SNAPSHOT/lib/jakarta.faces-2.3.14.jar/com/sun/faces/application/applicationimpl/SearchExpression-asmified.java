package asm.com.sun.faces.application.applicationimpl;
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
public class SearchExpressionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/application/applicationimpl/SearchExpression", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOGGER", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "associate", "Lcom/sun/faces/application/ApplicationAssociate;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/faces/application/ApplicationAssociate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "associate", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/search/CompositeSearchKeywordResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/search/CompositeSearchKeywordResolver", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/search/SearchKeywordResolverImplThis");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/search/SearchKeywordResolverImplThis", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/search/CompositeSearchKeywordResolver", "add", "(Ljakarta/faces/component/search/SearchKeywordResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/search/SearchKeywordResolverImplParent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/search/SearchKeywordResolverImplParent", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/search/CompositeSearchKeywordResolver", "add", "(Ljakarta/faces/component/search/SearchKeywordResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/search/SearchKeywordResolverImplForm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/search/SearchKeywordResolverImplForm", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/search/CompositeSearchKeywordResolver", "add", "(Ljakarta/faces/component/search/SearchKeywordResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/search/SearchKeywordResolverImplComposite");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/search/SearchKeywordResolverImplComposite", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/search/CompositeSearchKeywordResolver", "add", "(Ljakarta/faces/component/search/SearchKeywordResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/search/SearchKeywordResolverImplNext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/search/SearchKeywordResolverImplNext", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/search/CompositeSearchKeywordResolver", "add", "(Ljakarta/faces/component/search/SearchKeywordResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/search/SearchKeywordResolverImplPrevious");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/search/SearchKeywordResolverImplPrevious", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/search/CompositeSearchKeywordResolver", "add", "(Ljakarta/faces/component/search/SearchKeywordResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/search/SearchKeywordResolverImplNone");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/search/SearchKeywordResolverImplNone", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/search/CompositeSearchKeywordResolver", "add", "(Ljakarta/faces/component/search/SearchKeywordResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/search/SearchKeywordResolverImplNamingContainer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/search/SearchKeywordResolverImplNamingContainer", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/search/CompositeSearchKeywordResolver", "add", "(Ljakarta/faces/component/search/SearchKeywordResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/search/SearchKeywordResolverImplRoot");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/search/SearchKeywordResolverImplRoot", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/search/CompositeSearchKeywordResolver", "add", "(Ljakarta/faces/component/search/SearchKeywordResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/search/SearchKeywordResolverImplId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/search/SearchKeywordResolverImplId", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/search/CompositeSearchKeywordResolver", "add", "(Ljakarta/faces/component/search/SearchKeywordResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/search/SearchKeywordResolverImplChild");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/search/SearchKeywordResolverImplChild", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/search/CompositeSearchKeywordResolver", "add", "(Ljakarta/faces/component/search/SearchKeywordResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/search/SearchKeywordResolverImplAll");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/search/SearchKeywordResolverImplAll", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/search/CompositeSearchKeywordResolver", "add", "(Ljakarta/faces/component/search/SearchKeywordResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSearchExpressionHandler", "()Ljakarta/faces/component/search/SearchExpressionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "associate", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationAssociate", "getSearchExpressionHandler", "()Ljakarta/faces/component/search/SearchExpressionHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSearchExpressionHandler", "(Ljakarta/faces/component/search/SearchExpressionHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("searchExpressionHandler");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "notNull", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "associate", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationAssociate", "setSearchExpressionHandler", "(Ljakarta/faces/component/search/SearchExpressionHandler;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/applicationimpl/SearchExpression", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINE", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/applicationimpl/SearchExpression", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("Set SearchExpressionHandler Instance to ''{0}''");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/text/MessageFormat", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "fine", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addSearchKeywordResolver", "(Ljakarta/faces/component/search/SearchKeywordResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "associate", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationAssociate", "hasRequestBeenServiced", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("com.sun.faces.ILLEGAL_ATTEMPT_SETTING_APPLICATION_ARTIFACT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("SearchKeywordResolver");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/MessageUtils", "getExceptionMessageString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/search/CompositeSearchKeywordResolver", "add", "(Ljakarta/faces/component/search/SearchKeywordResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSearchKeywordResolver", "()Ljakarta/faces/component/search/SearchKeywordResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/applicationimpl/SearchExpression", "searchKeywordResolvers", "Lcom/sun/faces/component/search/CompositeSearchKeywordResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "APPLICATION", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/FacesLogger", "getLogger", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/applicationimpl/SearchExpression", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
