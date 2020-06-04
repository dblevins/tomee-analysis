package asm.org.apache.cxf.jaxrs.provider;
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
public class JavaTimeTypesParamConverterProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider", null, "java/lang/Object", new String[] { "javax/ws/rs/ext/ParamConverterProvider" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/ws/rs/ext/Provider;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$ZonedDateTimeConverter", "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider", "ZonedDateTimeConverter", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$OffsetTimeConverter", "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider", "OffsetTimeConverter", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$OffsetDateTimeConverter", "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider", "OffsetDateTimeConverter", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$LocalTimeConverter", "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider", "LocalTimeConverter", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$LocalDateConverter", "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider", "LocalDateConverter", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$LocalDateTimeConverter", "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider", "LocalDateTimeConverter", ACC_PUBLIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConverter", "(Ljava/lang/Class;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljavax/ws/rs/ext/ParamConverter;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljavax/ws/rs/ext/ParamConverter<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/time/LocalDateTime;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$LocalDateTimeConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$LocalDateTimeConverter", "<init>", "(Lorg/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/time/LocalDate;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$LocalDateConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$LocalDateConverter", "<init>", "(Lorg/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/time/LocalTime;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$LocalTimeConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$LocalTimeConverter", "<init>", "(Lorg/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/time/OffsetDateTime;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$OffsetDateTimeConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$OffsetDateTimeConverter", "<init>", "(Lorg/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/time/OffsetTime;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$OffsetTimeConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$OffsetTimeConverter", "<init>", "(Lorg/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/time/ZonedDateTime;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$ZonedDateTimeConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider$ZonedDateTimeConverter", "<init>", "(Lorg/apache/cxf/jaxrs/provider/JavaTimeTypesParamConverterProvider;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
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
