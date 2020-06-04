package asm.jakarta.json.bind;
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
public class JsonbDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/json/bind/Jsonb", null, "java/lang/Object", new String[] { "java/lang/AutoCloseable" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fromJson", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;)TT;", new String[] { "jakarta/json/bind/JsonbException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fromJson", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/reflect/Type;)TT;", new String[] { "jakarta/json/bind/JsonbException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fromJson", "(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/io/Reader;Ljava/lang/Class<TT;>;)TT;", new String[] { "jakarta/json/bind/JsonbException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fromJson", "(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/io/Reader;Ljava/lang/reflect/Type;)TT;", new String[] { "jakarta/json/bind/JsonbException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fromJson", "(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/io/InputStream;Ljava/lang/Class<TT;>;)TT;", new String[] { "jakarta/json/bind/JsonbException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fromJson", "(Ljava/io/InputStream;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/io/InputStream;Ljava/lang/reflect/Type;)TT;", new String[] { "jakarta/json/bind/JsonbException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toJson", "(Ljava/lang/Object;)Ljava/lang/String;", null, new String[] { "jakarta/json/bind/JsonbException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toJson", "(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;", null, new String[] { "jakarta/json/bind/JsonbException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toJson", "(Ljava/lang/Object;Ljava/io/Writer;)V", null, new String[] { "jakarta/json/bind/JsonbException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toJson", "(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/io/Writer;)V", null, new String[] { "jakarta/json/bind/JsonbException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toJson", "(Ljava/lang/Object;Ljava/io/OutputStream;)V", null, new String[] { "jakarta/json/bind/JsonbException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toJson", "(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/io/OutputStream;)V", null, new String[] { "jakarta/json/bind/JsonbException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
