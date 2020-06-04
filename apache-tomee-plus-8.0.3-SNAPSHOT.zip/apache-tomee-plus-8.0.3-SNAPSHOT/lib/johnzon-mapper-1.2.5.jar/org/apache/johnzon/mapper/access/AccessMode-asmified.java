package asm.org.apache.johnzon.mapper.access;
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
public class AccessModeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/johnzon/mapper/access/AccessMode", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/AccessMode$Factory", "org/apache/johnzon/mapper/access/AccessMode", "Factory", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/AccessMode$Reader", "org/apache/johnzon/mapper/access/AccessMode", "Reader", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/AccessMode$Writer", "org/apache/johnzon/mapper/access/AccessMode", "Writer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/mapper/access/AccessMode$DecoratedType", "org/apache/johnzon/mapper/access/AccessMode", "DecoratedType", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/mapper/ObjectConverter$Reader", "org/apache/johnzon/mapper/ObjectConverter", "Reader", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/mapper/ObjectConverter$Writer", "org/apache/johnzon/mapper/ObjectConverter", "Writer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "findFactory", "(Ljava/lang/Class;[Ljava/util/function/Function;)Lorg/apache/johnzon/mapper/access/AccessMode$Factory;", "(Ljava/lang/Class<*>;[Ljava/util/function/Function<Ljava/lang/reflect/AnnotatedElement;Ljava/lang/String;>;)Lorg/apache/johnzon/mapper/access/AccessMode$Factory;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findFactory", "(Ljava/lang/Class;)Lorg/apache/johnzon/mapper/access/AccessMode$Factory;", "(Ljava/lang/Class<*>;)Lorg/apache/johnzon/mapper/access/AccessMode$Factory;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/access/AccessMode", "findFactory", "(Ljava/lang/Class;[Ljava/util/function/Function;)Lorg/apache/johnzon/mapper/access/AccessMode$Factory;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fieldComparator", "(Ljava/lang/Class;)Ljava/util/Comparator;", "(Ljava/lang/Class<*>;)Ljava/util/Comparator<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findReaders", "(Ljava/lang/Class;)Ljava/util/Map;", "(Ljava/lang/Class<*>;)Ljava/util/Map<Ljava/lang/String;Lorg/apache/johnzon/mapper/access/AccessMode$Reader;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findWriters", "(Ljava/lang/Class;)Ljava/util/Map;", "(Ljava/lang/Class<*>;)Ljava/util/Map<Ljava/lang/String;Lorg/apache/johnzon/mapper/access/AccessMode$Writer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findReader", "(Ljava/lang/Class;)Lorg/apache/johnzon/mapper/ObjectConverter$Reader;", "(Ljava/lang/Class<*>;)Lorg/apache/johnzon/mapper/ObjectConverter$Reader<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findWriter", "(Ljava/lang/Class;)Lorg/apache/johnzon/mapper/ObjectConverter$Writer;", "(Ljava/lang/Class<*>;)Lorg/apache/johnzon/mapper/ObjectConverter$Writer<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findAdapter", "(Ljava/lang/Class;)Lorg/apache/johnzon/mapper/Adapter;", "(Ljava/lang/Class<*>;)Lorg/apache/johnzon/mapper/Adapter<**>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findAnyGetter", "(Ljava/lang/Class;)Ljava/lang/reflect/Method;", "(Ljava/lang/Class<*>;)Ljava/lang/reflect/Method;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "findAnySetter", "(Ljava/lang/Class;)Ljava/lang/reflect/Method;", "(Ljava/lang/Class<*>;)Ljava/lang/reflect/Method;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findMapAdder", "(Ljava/lang/Class;)Ljava/lang/reflect/Method;", "(Ljava/lang/Class<*>;)Ljava/lang/reflect/Method;", null);
methodVisitor.visitCode();
methodVisitor.visitInvokeDynamicInsn("get", "()Lorg/apache/johnzon/mapper/access/FindMethod;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/johnzon/mapper/access/AccessMode", "lambda$findMapAdder$0", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", true), Type.getType("(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;")});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/mapper/access/MapHelper", "find", "(Lorg/apache/johnzon/mapper/access/FindMethod;Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "afterParsed", "(Ljava/lang/Class;)V", "(Ljava/lang/Class<*>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$findMapAdder$0", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", null, new String[] { "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("add");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
