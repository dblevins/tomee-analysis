package asm.org.apache.cxf.microprofile.client;
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
public class MicroProfileServiceFactoryBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/microprofile/client/MicroProfileServiceFactoryBean", null, "org/apache/cxf/jaxrs/JAXRSServiceFactoryBean", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/JAXRSServiceFactoryBean", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createResourceInfo", "(Ljava/lang/Class;Z)Lorg/apache/cxf/jaxrs/model/ClassResourceInfo;", "(Ljava/lang/Class<*>;Z)Lorg/apache/cxf/jaxrs/model/ClassResourceInfo;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileServiceFactoryBean", "getBus", "()Lorg/apache/cxf/Bus;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/MediaType", "APPLICATION_JSON_TYPE", "Ljavax/ws/rs/core/MediaType;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/MediaType", "APPLICATION_JSON_TYPE", "Ljavax/ws/rs/core/MediaType;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/ResourceUtils", "createClassResourceInfo", "(Ljava/lang/Class;Ljava/lang/Class;Lorg/apache/cxf/jaxrs/model/ClassResourceInfo;ZZLorg/apache/cxf/Bus;Ljava/util/List;Ljava/util/List;)Lorg/apache/cxf/jaxrs/model/ClassResourceInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/microprofile/client/MicroProfileServiceFactoryBean", "addClassResourceInfo", "(Lorg/apache/cxf/jaxrs/model/ClassResourceInfo;)Lorg/apache/cxf/jaxrs/model/ClassResourceInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
