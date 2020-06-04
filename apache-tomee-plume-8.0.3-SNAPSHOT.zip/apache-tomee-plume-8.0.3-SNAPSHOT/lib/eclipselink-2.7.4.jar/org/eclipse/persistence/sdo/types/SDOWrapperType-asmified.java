package asm.org.eclipse.persistence.sdo.types;
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
public class SDOWrapperTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/sdo/types/SDOWrapperType", null, "org/eclipse/persistence/sdo/SDOType", new String[] { "commonj/sdo/Type" });

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$BooleanObjectWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "BooleanObjectWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$BooleanWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "BooleanWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$ByteObjectWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "ByteObjectWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$ByteWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "ByteWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$BytesWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "BytesWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$Bytes_hexBunaryWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "Bytes_hexBunaryWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$CharacterObjectWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "CharacterObjectWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$CharacterWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "CharacterWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$DateTimeWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "DateTimeWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$DateWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "DateWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$DayWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "DayWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$DecimalWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "DecimalWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$DoubleObjectWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "DoubleObjectWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$DoubleWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "DoubleWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$DurationWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "DurationWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$FloatObjectWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "FloatObjectWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$FloatWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "FloatWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$IntObjectWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "IntObjectWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$IntWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "IntWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$IntegerWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "IntegerWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$LongObjectWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "LongObjectWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$LongWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "LongWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$MonthDayWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "MonthDayWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$MonthWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "MonthWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$ObjectWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "ObjectWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$ShortObjectWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "ShortObjectWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$ShortWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "ShortWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$StringWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "StringWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$StringsWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "StringsWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$TimeWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "TimeWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$URIWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "URIWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$URI_QNameWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "URI_QNameWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$YearMonthDayWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "YearMonthDayWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$YearMonthWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "YearMonthWrapperImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/types/SDOWrapperType$YearWrapperImpl", "org/eclipse/persistence/sdo/types/SDOWrapperType", "YearWrapperImpl", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PACKAGE_NAME", "Ljava/lang/String;", null, "org.eclipse.persistence.sdo.dataobjects.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ATTRIBUTE_NAME", "Ljava/lang/String;", null, "value");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "XPATH", "Ljava/lang/String;", null, "text()");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "typeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "descriptorsMap", "Ljava/util/Map;", "Ljava/util/Map<Ljavax/xml/namespace/QName;Lorg/eclipse/persistence/oxm/XMLDescriptor;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcommonj/sdo/Type;Ljava/lang/String;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "<init>", "(Lcommonj/sdo/Type;Ljava/lang/String;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;Ljavax/xml/namespace/QName;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcommonj/sdo/Type;Ljava/lang/String;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;Ljavax/xml/namespace/QName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "<init>", "(Lcommonj/sdo/Type;Ljava/lang/String;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;[Ljavax/xml/namespace/QName;[Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcommonj/sdo/Type;Ljava/lang/String;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;Ljavax/xml/namespace/QName;Ljava/lang/Class;)V", "(Lcommonj/sdo/Type;Ljava/lang/String;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;Ljavax/xml/namespace/QName;Ljava/lang/Class<+Lorg/eclipse/persistence/sdo/SDODataObject;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "<init>", "(Lcommonj/sdo/Type;Ljava/lang/String;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;[Ljavax/xml/namespace/QName;[Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcommonj/sdo/Type;Ljava/lang/String;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;[Ljavax/xml/namespace/QName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "<init>", "(Lcommonj/sdo/Type;Ljava/lang/String;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;[Ljavax/xml/namespace/QName;[Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcommonj/sdo/Type;Ljava/lang/String;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;[Ljavax/xml/namespace/QName;[Ljava/lang/Class;)V", "(Lcommonj/sdo/Type;Ljava/lang/String;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;[Ljavax/xml/namespace/QName;[Ljava/lang/Class<+Lorg/eclipse/persistence/sdo/SDODataObject;>;)V", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/SecurityException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("org.eclipse.persistence.sdo");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/SDOType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "typeName", "Ljava/lang/String;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/SDOProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/SDOProperty", "<init>", "(Lcommonj/sdo/helper/HelperContext;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("value");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDOProperty", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDOProperty", "setType", "(Lcommonj/sdo/Type;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDOProperty", "setXsdType", "(Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "addDeclaredProperty", "(Lorg/eclipse/persistence/sdo/SDOProperty;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sdo/helper/extension/SDOUtil", "className", "(Ljava/lang/String;ZZZ)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/eclipse/persistence/sdo/types/SDOWrapperType", "commonj/sdo/Type", "java/lang/String", "org/eclipse/persistence/sdo/helper/SDOTypeHelper", "[Ljavax/xml/namespace/QName;", "[Ljava/lang/Class;", "org/eclipse/persistence/sdo/SDOProperty", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.eclipse.persistence.sdo.dataobjects.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("WrapperImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "setImplClassName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "getImplClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "javaImplClass", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "xmlDescriptor", "Lorg/eclipse/persistence/oxm/XMLDescriptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "javaImplClass", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "setJavaClass", "(Ljava/lang/Class;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "xmlDescriptor", "Lorg/eclipse/persistence/oxm/XMLDescriptor;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "initializeDescriptor", "(Lorg/eclipse/persistence/oxm/XMLDescriptor;Ljavax/xml/namespace/QName;Lcommonj/sdo/Type;Lorg/eclipse/persistence/sdo/SDOProperty;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "descriptorsMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "descriptorsMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "xmlDescriptor", "Lorg/eclipse/persistence/oxm/XMLDescriptor;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "xmlDescriptor", "Lorg/eclipse/persistence/oxm/XMLDescriptor;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "setSchemaContext", "(Lorg/eclipse/persistence/oxm/XMLDescriptor;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 8);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
Label label9 = new Label();
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLDescriptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLDescriptor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.eclipse.persistence.sdo.dataobjects.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("_");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("Wrapper");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/eclipse/persistence/oxm/XMLDescriptor", "javax/xml/namespace/QName", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/HelperContext", "getXMLHelper", "()Lcommonj/sdo/helper/XMLHelper;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/helper/SDOXMLHelper");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/sdo/helper/SDOXMLHelper", "getLoader", "()Lorg/eclipse/persistence/sdo/helper/SDOClassLoader;", true);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("Impl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/SDOClassLoader", "loadClass", "(Ljava/lang/String;Lorg/eclipse/persistence/sdo/SDOType;)Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "setJavaClass", "(Ljava/lang/Class;)V", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "setJavaClass", "(Ljava/lang/Class;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "getURI", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/SDOException", "classNotFound", "(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/SDOException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/SecurityException"});
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "getURI", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/SDOException", "classNotFound", "(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/SDOException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "initializeDescriptor", "(Lorg/eclipse/persistence/oxm/XMLDescriptor;Ljavax/xml/namespace/QName;Lcommonj/sdo/Type;Lorg/eclipse/persistence/sdo/SDOProperty;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "descriptorsMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "setSchemaContext", "(Lorg/eclipse/persistence/oxm/XMLDescriptor;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitIincInsn(8, 1);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPLT, label9);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setSchemaContext", "(Lorg/eclipse/persistence/oxm/XMLDescriptor;Ljavax/xml/namespace/QName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/schema/XMLSchemaURLReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/schema/XMLSchemaURLReference", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/schema/XMLSchemaURLReference", "setSchemaContextAsQName", "(Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "setSchemaReference", "(Lorg/eclipse/persistence/oxm/schema/XMLSchemaReference;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "initializeDescriptor", "(Lorg/eclipse/persistence/oxm/XMLDescriptor;Ljavax/xml/namespace/QName;Lcommonj/sdo/Type;Lorg/eclipse/persistence/sdo/SDOProperty;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "setNamespaceResolver", "(Lorg/eclipse/persistence/oxm/NamespaceResolver;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/SDOMethodAttributeAccessor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/SDOMethodAttributeAccessor", "<init>", "(Lcommonj/sdo/Property;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/oxm/XMLConstants", "QNAME_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/mappings/XMLTransformationMapping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/mappings/XMLTransformationMapping", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("value");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLTransformationMapping", "setAttributeName", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/metadata/QNameTransformer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("text()");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/metadata/QNameTransformer", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLTransformationMapping", "setAttributeTransformer", "(Lorg/eclipse/persistence/mappings/transformers/AttributeTransformer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("text()");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLTransformationMapping", "addFieldTransformer", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/transformers/FieldTransformer;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/NamespaceResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/NamespaceResolver", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/xmlns/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/NamespaceResolver", "setDefaultNamespaceURI", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLField", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLField", "setNamespaceResolver", "(Lorg/eclipse/persistence/oxm/NamespaceResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitLdcInsn("@xmlns");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLField", "setXPath", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/metadata/NamespaceURITransformer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/metadata/NamespaceURITransformer", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLTransformationMapping", "addFieldTransformer", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;Lorg/eclipse/persistence/mappings/transformers/FieldTransformer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLTransformationMapping", "setAttributeAccessor", "(Lorg/eclipse/persistence/mappings/AttributeAccessor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "addMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/sdo/helper/SDOMethodAttributeAccessor"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("value");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setAttributeName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("text()");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setXPath", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/Type", "getInstanceClass", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setAttributeClassification", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "getField", "()Lorg/eclipse/persistence/internal/helper/DatabaseField;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/XMLField");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLField", "setSchemaType", "(Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/mappings/XMLDirectMapping", "setAttributeAccessor", "(Lorg/eclipse/persistence/mappings/AttributeAccessor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "addMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLDescriptor", "setIsWrapper", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXmlDescriptor", "(Ljavax/xml/namespace/QName;)Lorg/eclipse/persistence/oxm/XMLDescriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "descriptorsMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/XMLDescriptor");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "xmlDescriptor", "Lorg/eclipse/persistence/oxm/XMLDescriptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/oxm/XMLDescriptor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDescriptorsMap", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "descriptorsMap", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addDescriptorToProject", "(Lorg/eclipse/persistence/sessions/Project;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "descriptorsMap", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/descriptors/ClassDescriptor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/Project", "addDescriptor", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAliasNames", "()Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Collections", "EMPTY_LIST", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBaseTypes", "()Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Collections", "EMPTY_LIST", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/types/SDOWrapperType", "typeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getURI", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("org.eclipse.persistence.sdo");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAbstract", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDataType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isOpen", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSequenced", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFinalized", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isWrapperType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("@");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "toHexString", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("{uri=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "getURI", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" name=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/types/SDOWrapperType", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("}");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
