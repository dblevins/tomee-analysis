package asm.org.apache.cxf.jaxrs.ext.search;
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
public class DefaultParamConverterProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider", null, "java/lang/Object", new String[] { "javax/ws/rs/ext/ParamConverterProvider" });

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$IntegerParamConverter", "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider", "IntegerParamConverter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$FloatParamConverter", "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider", "FloatParamConverter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$DoubleParamConverter", "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider", "DoubleParamConverter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$LongParamConverter", "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider", "LongParamConverter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$DateParamConverter", "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider", "DateParamConverter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "converters", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Class<*>;Ljavax/ws/rs/ext/ParamConverter<*>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider", "converters", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider", "converters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Date;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$DateParamConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$DateParamConverter", "<init>", "(Lorg/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider", "converters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$LongParamConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$LongParamConverter", "<init>", "(Lorg/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider", "converters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Double;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$DoubleParamConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$DoubleParamConverter", "<init>", "(Lorg/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider", "converters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Float;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$FloatParamConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$FloatParamConverter", "<init>", "(Lorg/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider", "converters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Integer;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$IntegerParamConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$IntegerParamConverter", "<init>", "(Lorg/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConverter", "(Ljava/lang/Class;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljavax/ws/rs/ext/ParamConverter;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljavax/ws/rs/ext/ParamConverter<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/DefaultParamConverterProvider", "converters", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ws/rs/ext/ParamConverter");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
