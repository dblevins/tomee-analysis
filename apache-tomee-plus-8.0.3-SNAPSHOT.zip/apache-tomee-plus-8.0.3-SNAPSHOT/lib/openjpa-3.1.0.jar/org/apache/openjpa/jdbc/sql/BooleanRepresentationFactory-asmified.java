package asm.org.apache.openjpa.jdbc.sql;
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
public class BooleanRepresentationFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$Int10BooleanRepresentation", "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "Int10BooleanRepresentation", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$BooleanBooleanRepresentation", "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "BooleanBooleanRepresentation", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$StringBooleanRepresentation", "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "StringBooleanRepresentation", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/Localizer$Message", "org/apache/openjpa/lib/util/Localizer", "Message", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "INT_10", "Lorg/apache/openjpa/jdbc/sql/BooleanRepresentation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "BOOLEAN", "Lorg/apache/openjpa/jdbc/sql/BooleanRepresentation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BUILTIN_BOOLEAN_REPRESENTATIONS", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/openjpa/jdbc/sql/BooleanRepresentation<*>;>;", null);
fieldVisitor.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Lorg/apache/openjpa/jdbc/sql/BooleanRepresentation;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "BUILTIN_BOOLEAN_REPRESENTATIONS", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/sql/BooleanRepresentation");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "contains", "(Ljava/lang/CharSequence;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "split", "(Ljava/lang/String;)[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$StringBooleanRepresentation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$StringBooleanRepresentation", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/jdbc/sql/BooleanRepresentation"}, 0, null);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "newInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/sql/BooleanRepresentation");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/jdbc/sql/BooleanRepresentation;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/Localizer", "forPackage", "(Ljava/lang/Class;)Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/UserException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("unknown-booleanRepresentation");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "BUILTIN_BOOLEAN_REPRESENTATIONS", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "keySet", "()Ljava/util/Set;", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "toString", "([Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;[Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/UserException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$Int10BooleanRepresentation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$Int10BooleanRepresentation", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "INT_10", "Lorg/apache/openjpa/jdbc/sql/BooleanRepresentation;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$BooleanBooleanRepresentation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$BooleanBooleanRepresentation", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "BOOLEAN", "Lorg/apache/openjpa/jdbc/sql/BooleanRepresentation;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "BUILTIN_BOOLEAN_REPRESENTATIONS", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "BUILTIN_BOOLEAN_REPRESENTATIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("BOOLEAN");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "BOOLEAN", "Lorg/apache/openjpa/jdbc/sql/BooleanRepresentation;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "BUILTIN_BOOLEAN_REPRESENTATIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("INT_10");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "INT_10", "Lorg/apache/openjpa/jdbc/sql/BooleanRepresentation;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "BUILTIN_BOOLEAN_REPRESENTATIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("STRING_10");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$StringBooleanRepresentation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("1");
methodVisitor.visitLdcInsn("0");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$StringBooleanRepresentation", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "BUILTIN_BOOLEAN_REPRESENTATIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("STRING_YN");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$StringBooleanRepresentation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Y");
methodVisitor.visitLdcInsn("N");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$StringBooleanRepresentation", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "BUILTIN_BOOLEAN_REPRESENTATIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("STRING_YN_LOWERCASE");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$StringBooleanRepresentation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("y");
methodVisitor.visitLdcInsn("n");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$StringBooleanRepresentation", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "BUILTIN_BOOLEAN_REPRESENTATIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("STRING_TF");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$StringBooleanRepresentation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("T");
methodVisitor.visitLdcInsn("F");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$StringBooleanRepresentation", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory", "BUILTIN_BOOLEAN_REPRESENTATIONS", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("STRING_TF_LOWERCASE");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$StringBooleanRepresentation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("t");
methodVisitor.visitLdcInsn("f");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/BooleanRepresentationFactory$StringBooleanRepresentation", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
