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
public class ObjectConverter$ReaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/johnzon/mapper/ObjectConverter$Reader", "<T:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/johnzon/mapper/MapperConverter;", "java/lang/Object", new String[] { "org/apache/johnzon/mapper/MapperConverter" });

classWriter.visitInnerClass("org/apache/johnzon/mapper/ObjectConverter$Reader", "org/apache/johnzon/mapper/ObjectConverter", "Reader", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fromJson", "(Ljavax/json/JsonValue;Ljava/lang/reflect/Type;Lorg/apache/johnzon/mapper/MappingParser;)Ljava/lang/Object;", "(Ljavax/json/JsonValue;Ljava/lang/reflect/Type;Lorg/apache/johnzon/mapper/MappingParser;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isGlobal", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
