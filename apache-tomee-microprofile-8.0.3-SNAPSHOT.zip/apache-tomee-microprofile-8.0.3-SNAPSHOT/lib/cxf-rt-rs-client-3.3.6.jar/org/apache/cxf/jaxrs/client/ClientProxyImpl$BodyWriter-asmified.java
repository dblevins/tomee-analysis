package asm.org.apache.cxf.jaxrs.client;
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
public class ClientProxyImpl$BodyWriterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/client/ClientProxyImpl$BodyWriter", null, "org/apache/cxf/jaxrs/client/AbstractClient$AbstractBodyWriter", null);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/client/ClientProxyImpl$BodyWriter", "org/apache/cxf/jaxrs/client/ClientProxyImpl", "BodyWriter", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/client/AbstractClient$AbstractBodyWriter", "org/apache/cxf/jaxrs/client/AbstractClient", "AbstractBodyWriter", ACC_PROTECTED | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/jaxrs/client/ClientProxyImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/cxf/jaxrs/client/ClientProxyImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/ClientProxyImpl$BodyWriter", "this$0", "Lorg/apache/cxf/jaxrs/client/ClientProxyImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/AbstractClient$AbstractBodyWriter", "<init>", "(Lorg/apache/cxf/jaxrs/client/AbstractClient;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doWriteBody", "(Lorg/apache/cxf/message/Message;Ljava/lang/Object;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/io/OutputStream;)V", null, new String[] { "org/apache/cxf/interceptor/Fault" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/jaxrs/model/OperationResourceInfo;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getContent", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/model/OperationResourceInfo");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/jaxrs/model/OperationResourceInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/model/OperationResourceInfo", "getMethodToInvoke", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("proxy.method.parameter.body.index");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/reflect/Method", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/model/OperationResourceInfo", "getAnnotatedMethod", "()Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/client/ClientProxyImpl", "getMethodAnnotations", "(Ljava/lang/reflect/Method;I)[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"[Ljava/lang/annotation/Annotation;"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_M1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getParameterTypes", "()[Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Ljava/lang/annotation/Annotation;", "java/lang/Class"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Class"});
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getGenericParameterTypes", "()[Ljava/lang/reflect/Type;", false);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Class", "java/lang/reflect/Type"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/model/OperationResourceInfo", "getClassResourceInfo", "()Lorg/apache/cxf/jaxrs/model/ClassResourceInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/model/ClassResourceInfo", "getServiceClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/InjectionUtils", "processGenericTypeIfNeeded", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/InjectionUtils", "updateParamClassToTypeIfNeeded", "(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/ClientProxyImpl$BodyWriter", "this$0", "Lorg/apache/cxf/jaxrs/client/ClientProxyImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/ClientProxyImpl", "writeBody", "(Ljava/lang/Object;Lorg/apache/cxf/message/Message;Ljava/lang/Class;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/io/OutputStream;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/reflect/Type"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/ClientProxyImpl$BodyWriter", "this$0", "Lorg/apache/cxf/jaxrs/client/ClientProxyImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/ClientProxyImpl", "writeBody", "(Ljava/lang/Object;Lorg/apache/cxf/message/Message;Ljava/lang/Class;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/io/OutputStream;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/Fault");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/Fault", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 13);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
