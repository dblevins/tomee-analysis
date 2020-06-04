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
public class JAXRSClientFactoryBean$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean$1", null, "java/lang/Object", new String[] { "javax/ws/rs/ext/ParamConverterProvider" });

classWriter.visitOuterClass("org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean", "initClient", "(Lorg/apache/cxf/jaxrs/client/AbstractClient;Lorg/apache/cxf/endpoint/Endpoint;Z)V");

classWriter.visitInnerClass("org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$encodeClientParametersList", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/jaxrs/client/JAXRSClientFactoryBean;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/jaxrs/client/JAXRSClientFactoryBean;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean$1", "this$0", "Lorg/apache/cxf/jaxrs/client/JAXRSClientFactoryBean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean$1", "val$encodeClientParametersList", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConverter", "(Ljava/lang/Class;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljavax/ws/rs/ext/ParamConverter;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljavax/ws/rs/ext/ParamConverter<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/HeaderParam;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/AnnotationUtils", "getAnnotation", "([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/CookieParam;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/AnnotationUtils", "getAnnotation", "([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/client/UrlEncodingParamConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/JAXRSClientFactoryBean$1", "val$encodeClientParametersList", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/UrlEncodingParamConverter", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
