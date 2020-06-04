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
public class WebClient$BodyWriterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/jaxrs/client/WebClient$BodyWriter", null, "org/apache/cxf/jaxrs/client/AbstractClient$AbstractBodyWriter", null);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/client/WebClient$BodyWriter", "org/apache/cxf/jaxrs/client/WebClient", "BodyWriter", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/client/WebClient$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/client/AbstractClient$AbstractBodyWriter", "org/apache/cxf/jaxrs/client/AbstractClient", "AbstractBodyWriter", ACC_PROTECTED | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/jaxrs/client/WebClient;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/cxf/jaxrs/client/WebClient;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/WebClient$BodyWriter", "this$0", "Lorg/apache/cxf/jaxrs/client/WebClient;");
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
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/WebClient$BodyWriter", "this$0", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "getRequestContext", "(Lorg/apache/cxf/message/Message;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("request.class");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("request.type");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Type");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/Map", "java/lang/Class", "java/lang/reflect/Type"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"[Ljava/lang/annotation/Annotation;"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitInsn(ICONST_1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/lang/annotation/Annotation;"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/WebClient$BodyWriter", "this$0", "Lorg/apache/cxf/jaxrs/client/WebClient;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ILOAD, 10);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNE, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/cxf/jaxrs/client/WebClient$BodyWriter", "org/apache/cxf/message/Message", "java/lang/Object", "java/lang/reflect/Type", "[Ljava/lang/annotation/Annotation;", "java/io/OutputStream", "java/util/Map", "java/lang/Class", "java/lang/reflect/Type", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER}, 3, new Object[] {"org/apache/cxf/jaxrs/client/WebClient", "java/lang/Object", "org/apache/cxf/message/Message"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/cxf/jaxrs/client/WebClient$BodyWriter", "org/apache/cxf/message/Message", "java/lang/Object", "java/lang/reflect/Type", "[Ljava/lang/annotation/Annotation;", "java/io/OutputStream", "java/util/Map", "java/lang/Class", "java/lang/reflect/Type", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER}, 3, new Object[] {"org/apache/cxf/jaxrs/client/WebClient", "java/lang/Object", "org/apache/cxf/message/Message"});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/cxf/jaxrs/client/WebClient$BodyWriter", "org/apache/cxf/message/Message", "java/lang/Object", "java/lang/reflect/Type", "[Ljava/lang/annotation/Annotation;", "java/io/OutputStream", "java/util/Map", "java/lang/Class", "java/lang/reflect/Type", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER}, 4, new Object[] {"org/apache/cxf/jaxrs/client/WebClient", "java/lang/Object", "org/apache/cxf/message/Message", "java/lang/Class"});
methodVisitor.visitVarInsn(ALOAD, 8);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ILOAD, 10);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNE, label13);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/cxf/jaxrs/client/WebClient$BodyWriter", "org/apache/cxf/message/Message", "java/lang/Object", "java/lang/reflect/Type", "[Ljava/lang/annotation/Annotation;", "java/io/OutputStream", "java/util/Map", "java/lang/Class", "java/lang/reflect/Type", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER}, 4, new Object[] {"org/apache/cxf/jaxrs/client/WebClient", "java/lang/Object", "org/apache/cxf/message/Message", "java/lang/Class"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
Label label14 = new Label();
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/cxf/jaxrs/client/WebClient$BodyWriter", "org/apache/cxf/message/Message", "java/lang/Object", "java/lang/reflect/Type", "[Ljava/lang/annotation/Annotation;", "java/io/OutputStream", "java/util/Map", "java/lang/Class", "java/lang/reflect/Type", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER}, 4, new Object[] {"org/apache/cxf/jaxrs/client/WebClient", "java/lang/Object", "org/apache/cxf/message/Message", "java/lang/Class"});
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/cxf/jaxrs/client/WebClient$BodyWriter", "org/apache/cxf/message/Message", "java/lang/Object", "java/lang/reflect/Type", "[Ljava/lang/annotation/Annotation;", "java/io/OutputStream", "java/util/Map", "java/lang/Class", "java/lang/reflect/Type", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER}, 5, new Object[] {"org/apache/cxf/jaxrs/client/WebClient", "java/lang/Object", "org/apache/cxf/message/Message", "java/lang/Class", "java/lang/reflect/Type"});
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/WebClient", "writeBody", "(Ljava/lang/Object;Lorg/apache/cxf/message/Message;Ljava/lang/Class;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/io/OutputStream;)V", false);
methodVisitor.visitLabel(label1);
Label label15 = new Label();
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/Fault");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/Fault", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/cxf/jaxrs/client/WebClient;Lorg/apache/cxf/jaxrs/client/WebClient$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/WebClient$BodyWriter", "<init>", "(Lorg/apache/cxf/jaxrs/client/WebClient;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
