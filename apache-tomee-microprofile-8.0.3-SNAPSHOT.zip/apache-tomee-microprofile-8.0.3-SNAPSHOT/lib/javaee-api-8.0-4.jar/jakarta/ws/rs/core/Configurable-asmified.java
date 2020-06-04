package asm.jakarta.ws.rs.core;
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
public class ConfigurableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/ws/rs/core/Configurable", "<C::Ljakarta/ws/rs/core/Configurable;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConfiguration", "()Ljakarta/ws/rs/core/Configuration;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "property", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Configurable;", "(Ljava/lang/String;Ljava/lang/Object;)TC;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "register", "(Ljava/lang/Class;)Ljakarta/ws/rs/core/Configurable;", "(Ljava/lang/Class<*>;)TC;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "register", "(Ljava/lang/Class;I)Ljakarta/ws/rs/core/Configurable;", "(Ljava/lang/Class<*>;I)TC;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "register", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljakarta/ws/rs/core/Configurable;", "(Ljava/lang/Class<*>;[Ljava/lang/Class<*>;)TC;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "register", "(Ljava/lang/Class;Ljava/util/Map;)Ljakarta/ws/rs/core/Configurable;", "(Ljava/lang/Class<*>;Ljava/util/Map<Ljava/lang/Class<*>;Ljava/lang/Integer;>;)TC;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "register", "(Ljava/lang/Object;)Ljakarta/ws/rs/core/Configurable;", "(Ljava/lang/Object;)TC;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "register", "(Ljava/lang/Object;I)Ljakarta/ws/rs/core/Configurable;", "(Ljava/lang/Object;I)TC;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "register", "(Ljava/lang/Object;[Ljava/lang/Class;)Ljakarta/ws/rs/core/Configurable;", "(Ljava/lang/Object;[Ljava/lang/Class<*>;)TC;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "register", "(Ljava/lang/Object;Ljava/util/Map;)Ljakarta/ws/rs/core/Configurable;", "(Ljava/lang/Object;Ljava/util/Map<Ljava/lang/Class<*>;Ljava/lang/Integer;>;)TC;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
