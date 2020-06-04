package asm.org.apache.openjpa.kernel.exps;
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
public class QueryExpressionsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/kernel/exps/QueryExpressions", null, "java/lang/Object", new String[] { "java/io/Serializable" });

classWriter.visitInnerClass("org/apache/openjpa/kernel/exps/QueryExpressions$ParameterExpressionVisitor", "org/apache/openjpa/kernel/exps/QueryExpressions", "ParameterExpressionVisitor", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/kernel/exps/QueryExpressions$AggregateExpressionVisitor", "org/apache/openjpa/kernel/exps/QueryExpressions", "AggregateExpressionVisitor", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DISTINCT_AUTO", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DISTINCT_TRUE", "I", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DISTINCT_FALSE", "I", null, new Integer(8));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_VALUES", "[Lorg/apache/openjpa/kernel/exps/Value;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "updates", "Ljava/util/Map;", "Ljava/util/Map<Lorg/apache/openjpa/kernel/exps/Path;Lorg/apache/openjpa/kernel/exps/Value;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "distinct", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "alias", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "projections", "[Lorg/apache/openjpa/kernel/exps/Value;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "projectionClauses", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "projectionAliases", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "resultClass", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "filter", "Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "grouping", "[Lorg/apache/openjpa/kernel/exps/Value;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "groupingClauses", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "having", "Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "ordering", "[Lorg/apache/openjpa/kernel/exps/Value;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "ascending", "[Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "orderingClauses", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "orderingAliases", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "parameterTypes", "Lorg/apache/openjpa/lib/util/OrderedMap;", "Lorg/apache/openjpa/lib/util/OrderedMap<Ljava/lang/Object;Ljava/lang/Class<*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "operation", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "accessPath", "[Lorg/apache/openjpa/meta/ClassMetaData;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "fetchPaths", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "fetchInnerPaths", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "range", "[Lorg/apache/openjpa/kernel/exps/Value;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_aggregate", "Ljava/lang/Boolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_contexts", "Ljava/util/Stack;", "Ljava/util/Stack<Lorg/apache/openjpa/kernel/exps/Context;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "state", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "shape", "Lorg/apache/openjpa/kernel/ResultShape;", "Lorg/apache/openjpa/kernel/ResultShape<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "hasInExpression", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyMap", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "updates", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "distinct", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "alias", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/exps/QueryExpressions", "EMPTY_VALUES", "[Lorg/apache/openjpa/kernel/exps/Value;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "projections", "[Lorg/apache/openjpa/kernel/exps/Value;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/StoreQuery", "EMPTY_STRINGS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "projectionClauses", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/StoreQuery", "EMPTY_STRINGS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "projectionAliases", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "resultClass", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "filter", "Lorg/apache/openjpa/kernel/exps/Expression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/exps/QueryExpressions", "EMPTY_VALUES", "[Lorg/apache/openjpa/kernel/exps/Value;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "grouping", "[Lorg/apache/openjpa/kernel/exps/Value;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/StoreQuery", "EMPTY_STRINGS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "groupingClauses", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "having", "Lorg/apache/openjpa/kernel/exps/Expression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/exps/QueryExpressions", "EMPTY_VALUES", "[Lorg/apache/openjpa/kernel/exps/Value;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "ordering", "[Lorg/apache/openjpa/kernel/exps/Value;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/StoreQuery", "EMPTY_BOOLEANS", "[Z");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "ascending", "[Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/StoreQuery", "EMPTY_STRINGS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "orderingClauses", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/StoreQuery", "EMPTY_STRINGS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "orderingAliases", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/StoreQuery", "EMPTY_ORDERED_PARAMS", "Lorg/apache/openjpa/lib/util/OrderedMap;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "parameterTypes", "Lorg/apache/openjpa/lib/util/OrderedMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "operation", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/StoreQuery", "EMPTY_METAS", "[Lorg/apache/openjpa/meta/ClassMetaData;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "accessPath", "[Lorg/apache/openjpa/meta/ClassMetaData;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/StoreQuery", "EMPTY_STRINGS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "fetchPaths", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/StoreQuery", "EMPTY_STRINGS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "fetchInnerPaths", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/kernel/exps/QueryExpressions", "EMPTY_VALUES", "[Lorg/apache/openjpa/kernel/exps/Value;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "range", "[Lorg/apache/openjpa/kernel/exps/Value;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "_aggregate", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "_contexts", "Ljava/util/Stack;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContexts", "(Ljava/util/Stack;)V", "(Ljava/util/Stack<Lorg/apache/openjpa/kernel/exps/Context;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "_contexts", "Ljava/util/Stack;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ctx", "()Lorg/apache/openjpa/kernel/exps/Context;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "_contexts", "Ljava/util/Stack;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Stack", "peek", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/kernel/exps/Context");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAggregate", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "projections", "[Lorg/apache/openjpa/kernel/exps/Value;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "_aggregate", "Ljava/lang/Boolean;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "projections", "[Lorg/apache/openjpa/kernel/exps/Value;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/kernel/exps/QueryExpressions$AggregateExpressionVisitor", "isAggregate", "([Lorg/apache/openjpa/kernel/exps/Value;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openjpa/kernel/exps/QueryExpressions"});
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/openjpa/kernel/exps/QueryExpressions"}, 2, new Object[] {"org/apache/openjpa/kernel/exps/QueryExpressions", "java/lang/Boolean"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "_aggregate", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "_aggregate", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDistinct", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "distinct", "I");
methodVisitor.visitIntInsn(BIPUSH, 8);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParameterizedFields", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/openjpa/meta/FieldMetaData;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "filter", "Lorg/apache/openjpa/kernel/exps/Expression;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/kernel/exps/QueryExpressions$ParameterExpressionVisitor", "collectParameterizedFields", "(Lorg/apache/openjpa/kernel/exps/Expression;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "putUpdate", "(Lorg/apache/openjpa/kernel/exps/Path;Lorg/apache/openjpa/kernel/exps/Value;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "updates", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Collections", "EMPTY_MAP", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "updates", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/exps/QueryExpressions", "updates", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/kernel/exps/Value");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/kernel/exps/QueryExpressions", "EMPTY_VALUES", "[Lorg/apache/openjpa/kernel/exps/Value;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
