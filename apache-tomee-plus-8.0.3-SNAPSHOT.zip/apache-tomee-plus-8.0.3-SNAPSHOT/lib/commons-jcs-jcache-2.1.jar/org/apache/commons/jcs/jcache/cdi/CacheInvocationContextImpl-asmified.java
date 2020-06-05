package asm.org.apache.commons.jcs.jcache.cdi;
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
public class CacheInvocationContextImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/jcache/cdi/CacheInvocationContextImpl", "<A::Ljava/lang/annotation/Annotation;>Lorg/apache/commons/jcs/jcache/cdi/CacheMethodDetailsImpl<TA;>;Ljavax/cache/annotation/CacheInvocationContext<TA;>;", "org/apache/commons/jcs/jcache/cdi/CacheMethodDetailsImpl", new String[] { "javax/cache/annotation/CacheInvocationContext" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parameters", "[Ljavax/cache/annotation/CacheInvocationParameter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/interceptor/InvocationContext;Ljava/lang/annotation/Annotation;Ljava/lang/String;)V", "(Ljakarta/interceptor/InvocationContext;TA;Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/cdi/CacheMethodDetailsImpl", "<init>", "(Ljakarta/interceptor/InvocationContext;Ljava/lang/annotation/Annotation;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/jcache/cdi/CacheInvocationContextImpl", "parameters", "[Ljavax/cache/annotation/CacheInvocationParameter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTarget", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheInvocationContextImpl", "delegate", "Ljakarta/interceptor/InvocationContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/interceptor/InvocationContext", "getTarget", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAllParameters", "()[Ljavax/cache/annotation/CacheInvocationParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheInvocationContextImpl", "parameters", "[Ljavax/cache/annotation/CacheInvocationParameter;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/jcache/cdi/CacheInvocationContextImpl", "doGetAllParameters", "([Ljava/lang/Integer;)[Ljavax/cache/annotation/CacheInvocationParameter;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/jcache/cdi/CacheInvocationContextImpl", "parameters", "[Ljavax/cache/annotation/CacheInvocationParameter;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheInvocationContextImpl", "parameters", "[Ljavax/cache/annotation/CacheInvocationParameter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unwrap", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doGetAllParameters", "([Ljava/lang/Integer;)[Ljavax/cache/annotation/CacheInvocationParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/jcache/cdi/CacheInvocationContextImpl", "delegate", "Ljakarta/interceptor/InvocationContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/interceptor/InvocationContext", "getParameters", "()[Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/jcache/cdi/CacheInvocationContextImpl", "getMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getParameterTypes", "()[Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/jcache/cdi/CacheInvocationContextImpl", "getMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getParameterAnnotations", "()[[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/lang/Object;", "[Ljava/lang/Class;", "[[Ljava/lang/annotation/Annotation;"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/cache/annotation/CacheInvocationParameter");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Ljavax/cache/annotation/CacheInvocationParameter;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/cdi/CacheInvocationContextImpl", "newCacheInvocationParameterImpl", "(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;I)Lorg/apache/commons/jcs/jcache/cdi/CacheInvocationParameterImpl;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPGE, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/cdi/CacheInvocationContextImpl", "newCacheInvocationParameterImpl", "(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;I)Lorg/apache/commons/jcs/jcache/cdi/CacheInvocationParameterImpl;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "newCacheInvocationParameterImpl", "(Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;I)Lorg/apache/commons/jcs/jcache/cdi/CacheInvocationParameterImpl;", "(Ljava/lang/Class<*>;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;I)Lorg/apache/commons/jcs/jcache/cdi/CacheInvocationParameterImpl;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/jcache/cdi/CacheInvocationParameterImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/cdi/CacheInvocationParameterImpl", "<init>", "(Ljava/lang/Class;Ljava/lang/Object;Ljava/util/Set;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
