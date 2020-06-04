package asm.org.apache.johnzon.mapper;
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
public class Mappings$ClassMappingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/johnzon/mapper/Mappings$ClassMapping", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/AccessMode$Factory", "org/apache/johnzon/mapper/access/AccessMode", "Factory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/mapper/Mappings$Getter", "org/apache/johnzon/mapper/Mappings", "Getter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/johnzon/mapper/Mappings$Setter", "org/apache/johnzon/mapper/Mappings", "Setter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/johnzon/mapper/ObjectConverter$Reader", "org/apache/johnzon/mapper/ObjectConverter", "Reader", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/mapper/ObjectConverter$Writer", "org/apache/johnzon/mapper/ObjectConverter", "Writer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/mapper/Mappings$ClassMapping", "org/apache/johnzon/mapper/Mappings", "ClassMapping", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "clazz", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "factory", "Lorg/apache/johnzon/mapper/access/AccessMode$Factory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "getters", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/johnzon/mapper/Mappings$Getter;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "setters", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/johnzon/mapper/Mappings$Setter;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "adapter", "Lorg/apache/johnzon/mapper/Adapter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "reader", "Lorg/apache/johnzon/mapper/ObjectConverter$Reader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "writer", "Lorg/apache/johnzon/mapper/ObjectConverter$Writer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "anyGetter", "Lorg/apache/johnzon/mapper/Mappings$Getter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "anySetter", "Ljava/lang/reflect/Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "mapAdder", "Ljava/lang/reflect/Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "mapAdderType", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "deduplicateObjects", "Ljava/lang/Boolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "deduplicationEvaluated", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/Class;Lorg/apache/johnzon/mapper/access/AccessMode$Factory;Ljava/util/Map;Ljava/util/Map;Lorg/apache/johnzon/mapper/Adapter;Lorg/apache/johnzon/mapper/ObjectConverter$Reader;Lorg/apache/johnzon/mapper/ObjectConverter$Writer;Lorg/apache/johnzon/mapper/Mappings$Getter;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "(Ljava/lang/Class<*>;Lorg/apache/johnzon/mapper/access/AccessMode$Factory;Ljava/util/Map<Ljava/lang/String;Lorg/apache/johnzon/mapper/Mappings$Getter;>;Ljava/util/Map<Ljava/lang/String;Lorg/apache/johnzon/mapper/Mappings$Setter;>;Lorg/apache/johnzon/mapper/Adapter<**>;Lorg/apache/johnzon/mapper/ObjectConverter$Reader<*>;Lorg/apache/johnzon/mapper/ObjectConverter$Writer<*>;Lorg/apache/johnzon/mapper/Mappings$Getter;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "deduplicationEvaluated", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "clazz", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "factory", "Lorg/apache/johnzon/mapper/access/AccessMode$Factory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "getters", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "setters", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "adapter", "Lorg/apache/johnzon/mapper/Adapter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "writer", "Lorg/apache/johnzon/mapper/ObjectConverter$Writer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "reader", "Lorg/apache/johnzon/mapper/ObjectConverter$Reader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "anyGetter", "Lorg/apache/johnzon/mapper/Mappings$Getter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "anySetter", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "mapAdder", "Ljava/lang/reflect/Method;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/johnzon/mapper/Mappings$ClassMapping", "java/lang/Class", "org/apache/johnzon/mapper/access/AccessMode$Factory", "java/util/Map", "java/util/Map", "org/apache/johnzon/mapper/Adapter", "org/apache/johnzon/mapper/ObjectConverter$Reader", "org/apache/johnzon/mapper/ObjectConverter$Writer", "org/apache/johnzon/mapper/Mappings$Getter", "java/lang/reflect/Method", "java/lang/reflect/Method"}, 1, new Object[] {"org/apache/johnzon/mapper/Mappings$ClassMapping"});
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getParameterTypes", "()[Ljava/lang/Class;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/johnzon/mapper/Mappings$ClassMapping", "java/lang/Class", "org/apache/johnzon/mapper/access/AccessMode$Factory", "java/util/Map", "java/util/Map", "org/apache/johnzon/mapper/Adapter", "org/apache/johnzon/mapper/ObjectConverter$Reader", "org/apache/johnzon/mapper/ObjectConverter$Writer", "org/apache/johnzon/mapper/Mappings$Getter", "java/lang/reflect/Method", "java/lang/reflect/Method"}, 2, new Object[] {"org/apache/johnzon/mapper/Mappings$ClassMapping", "java/lang/Class"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "mapAdderType", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDeduplicateObjects", "()Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "deduplicationEvaluated", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "clazz", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/johnzon/mapper/JohnzonDeduplicateObjects;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/johnzon/mapper/JohnzonDeduplicateObjects");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/JohnzonDeduplicateObjects", "value", "()Z", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "deduplicateObjects", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/johnzon/mapper/JohnzonDeduplicateObjects"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "deduplicationEvaluated", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/Mappings$ClassMapping", "deduplicateObjects", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
