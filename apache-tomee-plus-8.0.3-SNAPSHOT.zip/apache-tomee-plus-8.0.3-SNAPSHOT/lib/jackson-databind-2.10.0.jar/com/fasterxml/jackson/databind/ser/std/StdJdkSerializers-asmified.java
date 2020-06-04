package asm.com.fasterxml.jackson.databind.ser.std;
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
public class StdJdkSerializersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/fasterxml/jackson/databind/ser/std/StdJdkSerializers", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicLongSerializer", "com/fasterxml/jackson/databind/ser/std/StdJdkSerializers", "AtomicLongSerializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicIntegerSerializer", "com/fasterxml/jackson/databind/ser/std/StdJdkSerializers", "AtomicIntegerSerializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicBooleanSerializer", "com/fasterxml/jackson/databind/ser/std/StdJdkSerializers", "AtomicBooleanSerializer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "all", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljava/util/Map$Entry<Ljava/lang/Class<*>;Ljava/lang/Object;>;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoClassDefFoundError");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/net/URL;"));
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ser/std/ToStringSerializer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Ljava/net/URL;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ser/std/ToStringSerializer", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/net/URI;"));
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ser/std/ToStringSerializer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Ljava/net/URI;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ser/std/ToStringSerializer", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Currency;"));
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ser/std/ToStringSerializer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Currency;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ser/std/ToStringSerializer", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/UUID;"));
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ser/std/UUIDSerializer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ser/std/UUIDSerializer", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/regex/Pattern;"));
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ser/std/ToStringSerializer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/regex/Pattern;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ser/std/ToStringSerializer", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Locale;"));
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/ser/std/ToStringSerializer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Locale;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/ser/std/ToStringSerializer", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/concurrent/atomic/AtomicBoolean;"));
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicBooleanSerializer;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/concurrent/atomic/AtomicInteger;"));
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicIntegerSerializer;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/concurrent/atomic/AtomicLong;"));
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicLongSerializer;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/io/File;"));
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/ser/std/FileSerializer;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Class;"));
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/ser/std/ClassSerializer;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Void;"));
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ser/std/NullSerializer", "instance", "Lcom/fasterxml/jackson/databind/ser/std/NullSerializer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ser/std/NullSerializer", "instance", "Lcom/fasterxml/jackson/databind/ser/std/NullSerializer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Timestamp;"));
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/ser/std/DateSerializer", "instance", "Lcom/fasterxml/jackson/databind/ser/std/DateSerializer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Date;"));
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/ser/std/SqlDateSerializer;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Time;"));
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/ser/std/SqlTimeSerializer;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"java/util/HashMap"}, 1, new Object[] {"java/lang/NoClassDefFoundError"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "entrySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
