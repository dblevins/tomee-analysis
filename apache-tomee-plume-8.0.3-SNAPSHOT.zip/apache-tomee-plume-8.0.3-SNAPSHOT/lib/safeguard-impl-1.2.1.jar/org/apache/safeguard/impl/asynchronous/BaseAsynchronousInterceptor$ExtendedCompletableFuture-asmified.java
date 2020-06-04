package asm.org.apache.safeguard.impl.asynchronous;
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
public class BaseAsynchronousInterceptor$ExtendedCompletableFutureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor$ExtendedCompletableFuture", "<T:Ljava/lang/Object;>Ljava/util/concurrent/CompletableFuture<TT;>;Lorg/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor$BaseFuture;", "java/util/concurrent/CompletableFuture", new String[] { "org/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor$BaseFuture" });

classWriter.visitInnerClass("org/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor$ExtendedCompletableFuture", "org/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor", "ExtendedCompletableFuture", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor$BaseFuture", "org/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor", "BaseFuture", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/CompletableFuture", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
