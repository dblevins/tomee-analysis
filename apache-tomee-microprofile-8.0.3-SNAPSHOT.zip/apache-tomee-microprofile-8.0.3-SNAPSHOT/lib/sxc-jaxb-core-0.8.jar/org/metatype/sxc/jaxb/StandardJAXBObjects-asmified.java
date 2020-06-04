package asm.org.metatype.sxc.jaxb;
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
public class StandardJAXBObjectsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/metatype/sxc/jaxb/StandardJAXBObjects", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$UUIDJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "UUIDJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$DurationJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "DurationJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$XMLGregorianCalendarJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "XMLGregorianCalendarJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$URIJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "URIJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$QNameJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "QNameJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$DateJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "DateJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$CalendarJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "CalendarJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "BooleanJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$DoubleJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "DoubleJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$FloatJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "FloatJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$BigDecimalJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "BigDecimalJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$ShortJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "ShortJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$LongJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "LongJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$IntegerJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "IntegerJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$BigIntegerJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "BigIntegerJAXB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$StringJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "StringJAXB", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "datatypeFactory", "Ljavax/xml/datatype/DatatypeFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "jaxbObjectByClass", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Class;Lorg/metatype/sxc/jaxb/JAXBObject;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "jaxbObjectBySchemaType", "Ljava/util/Map;", "Ljava/util/Map<Ljavax/xml/namespace/QName;Lorg/metatype/sxc/jaxb/JAXBObject;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "()Ljavax/xml/datatype/DatatypeFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects", "datatypeFactory", "Ljavax/xml/datatype/DatatypeFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/datatype/DatatypeConfigurationException");
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/datatype/DatatypeFactory", "newInstance", "()Ljavax/xml/datatype/DatatypeFactory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects", "datatypeFactory", "Ljavax/xml/datatype/DatatypeFactory;");
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$StringJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$StringJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$StringJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$StringJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$StringJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$BigIntegerJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$BigIntegerJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$BigIntegerJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$BigIntegerJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$BigIntegerJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$IntegerJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$IntegerJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$IntegerJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$IntegerJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$IntegerJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$LongJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$LongJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$LongJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$LongJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$LongJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$ShortJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$ShortJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$ShortJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$ShortJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$ShortJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$BigDecimalJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$BigDecimalJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$BigDecimalJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$BigDecimalJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$BigDecimalJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$FloatJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$FloatJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$FloatJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$FloatJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$FloatJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$DoubleJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$DoubleJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$DoubleJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$DoubleJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$DoubleJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$CalendarJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$CalendarJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$CalendarJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$CalendarJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$CalendarJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$DateJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$DateJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$DateJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$DateJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$DateJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$QNameJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$QNameJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$QNameJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$QNameJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$QNameJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$URIJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$URIJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$URIJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$URIJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$URIJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$XMLGregorianCalendarJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$XMLGregorianCalendarJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$XMLGregorianCalendarJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$XMLGregorianCalendarJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$XMLGregorianCalendarJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$DurationJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$DurationJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$DurationJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$DurationJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$DurationJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$UUIDJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$UUIDJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$UUIDJAXB", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$UUIDJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$UUIDJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableMap", "(Ljava/util/Map;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects", "jaxbObjectByClass", "Ljava/util/Map;");
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$StringJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$StringJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$StringJAXB", "getXmlType", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$StringJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$StringJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$BigIntegerJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$BigIntegerJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$BigIntegerJAXB", "getXmlType", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$BigIntegerJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$BigIntegerJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$IntegerJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$IntegerJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$IntegerJAXB", "getXmlType", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$IntegerJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$IntegerJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$LongJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$LongJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$LongJAXB", "getXmlType", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$LongJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$LongJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$ShortJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$ShortJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$ShortJAXB", "getXmlType", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$ShortJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$ShortJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$BigDecimalJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$BigDecimalJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$BigDecimalJAXB", "getXmlType", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$BigDecimalJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$BigDecimalJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$FloatJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$FloatJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$FloatJAXB", "getXmlType", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$FloatJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$FloatJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$DoubleJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$DoubleJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$DoubleJAXB", "getXmlType", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$DoubleJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$DoubleJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB", "getXmlType", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$QNameJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$QNameJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$QNameJAXB", "getXmlType", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$QNameJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$QNameJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$DurationJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$DurationJAXB;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$DurationJAXB", "getXmlType", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$DurationJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$DurationJAXB;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableMap", "(Ljava/util/Map;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects", "jaxbObjectBySchemaType", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
