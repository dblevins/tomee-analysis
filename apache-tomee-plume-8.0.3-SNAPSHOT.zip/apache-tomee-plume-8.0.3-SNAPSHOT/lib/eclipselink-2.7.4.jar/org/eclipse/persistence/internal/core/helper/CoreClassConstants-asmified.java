package asm.org.eclipse.persistence.internal.core.helper;
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
public class CoreClassConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ABYTE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APBYTE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APCHAR", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ASTRING", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ArrayList_class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BIGDECIMAL", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BIGINTEGER", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOOLEAN", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BYTE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CALENDAR", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHAR", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLASS", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Collection_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOUBLE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DURATION", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLOAT", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GREGORIAN_CALENDAR", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTEGER", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "List_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LONG", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Map_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NODE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NUMBER", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OBJECT", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PBOOLEAN", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PBYTE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PCHAR", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PDOUBLE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PFLOAT", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PINT", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PLONG", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PSHORT", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QNAME", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Set_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHORT", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SQLDATE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STRING", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIME", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIMESTAMP", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "URL_Class", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UTILDATE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_GREGORIAN_CALENDAR", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FILE", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("[Ljava/lang/Byte;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "ABYTE", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("[B"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "APBYTE", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("[C"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "APCHAR", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("[Ljava/lang/String;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "ASTRING", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/ArrayList;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "ArrayList_class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/math/BigDecimal;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "BIGDECIMAL", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/math/BigInteger;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "BIGINTEGER", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Boolean;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "BOOLEAN", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Byte;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "BYTE", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Calendar;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "CALENDAR", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Character;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "CHAR", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Class;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "CLASS", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Collection;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "Collection_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Double;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "DOUBLE", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/datatype/Duration;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "DURATION", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Float;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "FLOAT", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/GregorianCalendar;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "GREGORIAN_CALENDAR", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Integer;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "INTEGER", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "List_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "LONG", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Map;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "Map_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/w3c/dom/Node;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "NODE", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Number;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "NUMBER", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "OBJECT", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "PBOOLEAN", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Byte", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "PBYTE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Character", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "PCHAR", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Double", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "PDOUBLE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Float", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "PFLOAT", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "PINT", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Long", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "PLONG", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Short", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "PSHORT", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/namespace/QName;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "QNAME", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Set;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "Set_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Short;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "SHORT", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Date;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "SQLDATE", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Time;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "TIME", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Timestamp;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "TIMESTAMP", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/net/URL;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "URL_Class", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Date;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "UTILDATE", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/datatype/XMLGregorianCalendar;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "XML_GREGORIAN_CALENDAR", "Ljava/lang/Class;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/io/File;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/core/helper/CoreClassConstants", "FILE", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
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
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
