package asm.org.apache.cxf.jaxrs.ext.search.odata;
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
public class ODataParserDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser", "<T:Ljava/lang/Object;>Lorg/apache/cxf/jaxrs/ext/search/AbstractSearchConditionParser<TT;>;", "org/apache/cxf/jaxrs/ext/search/AbstractSearchConditionParser", null);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/odata/ODataParser$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/odata/ODataParser$FilterExpressionVisitor", "org/apache/cxf/jaxrs/ext/search/odata/ODataParser", "FilterExpressionVisitor", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/odata/ODataParser$TypedValue", "org/apache/cxf/jaxrs/ext/search/odata/ODataParser", "TypedValue", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/odata/ODataParser$TypedProperty", "org/apache/cxf/jaxrs/ext/search/odata/ODataParser", "TypedProperty", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/Beanspector$TypeInfo", "org/apache/cxf/jaxrs/ext/search/Beanspector", "TypeInfo", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "parser", "Lorg/apache/olingo/odata2/core/uri/expression/FilterParser;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Class;)V", "(Ljava/lang/Class<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyMap", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser", "<init>", "(Ljava/lang/Class;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Class;Ljava/util/Map;)V", "(Ljava/lang/Class<TT;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser", "<init>", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/Map;)V", "(Ljava/lang/Class<TT;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/AbstractSearchConditionParser", "<init>", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/olingo/odata2/core/uri/expression/FilterParserImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/olingo/odata2/core/uri/expression/FilterParserImpl", "<init>", "(Lorg/apache/olingo/odata2/api/edm/EdmEntityType;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser", "parser", "Lorg/apache/olingo/odata2/core/uri/expression/FilterParser;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/SearchCondition;", "(Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/SearchCondition<TT;>;", new String[] { "org/apache/cxf/jaxrs/ext/search/SearchParseException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/olingo/odata2/api/exception/ODataMessageException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/olingo/odata2/api/exception/ODataApplicationException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/InstantiationException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalAccessException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser", "conditionClass", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "newInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser", "parser", "Lorg/apache/olingo/odata2/core/uri/expression/FilterParser;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/olingo/odata2/core/uri/expression/FilterParser", "parseFilterString", "(Ljava/lang/String;)Lorg/apache/olingo/odata2/api/uri/expression/FilterExpression;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser$FilterExpressionVisitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser$FilterExpressionVisitor", "<init>", "(Lorg/apache/cxf/jaxrs/ext/search/odata/ODataParser;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/olingo/odata2/api/uri/expression/FilterExpression", "accept", "(Lorg/apache/olingo/odata2/api/uri/expression/ExpressionVisitor;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/ext/search/SearchCondition");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/SearchParseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/SearchParseException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/cxf/jaxrs/ext/search/odata/ODataParser;)Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser", "isDecodeQueryValues", "()Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lorg/apache/cxf/jaxrs/ext/search/odata/ODataParser;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lorg/apache/cxf/jaxrs/ext/search/Beanspector$TypeInfo;Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "org/apache/cxf/jaxrs/ext/search/SearchParseException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser", "parseType", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lorg/apache/cxf/jaxrs/ext/search/Beanspector$TypeInfo;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lorg/apache/cxf/jaxrs/ext/search/odata/ODataParser;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser", "getActualSetterName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$800", "(Lorg/apache/cxf/jaxrs/ext/search/odata/ODataParser;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/Beanspector$TypeInfo;", null, new String[] { "org/apache/cxf/jaxrs/ext/search/SearchParseException", "org/apache/cxf/jaxrs/ext/search/PropertyNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser", "getTypeInfo", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/Beanspector$TypeInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
