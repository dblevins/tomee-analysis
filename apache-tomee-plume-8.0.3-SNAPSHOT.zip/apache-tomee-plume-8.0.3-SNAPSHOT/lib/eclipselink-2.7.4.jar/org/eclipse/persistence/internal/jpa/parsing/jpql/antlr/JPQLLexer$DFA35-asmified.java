package asm.org.eclipse.persistence.internal.jpa.parsing.jpql.antlr;
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
public class JPQLLexer$DFA35Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA35", null, "org/eclipse/persistence/internal/libraries/antlr/runtime/DFA", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA35", "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA35", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/BaseRecognizer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA35", "this$0", "Lorg/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/DFA", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA35", "recognizer", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/BaseRecognizer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA35", "decisionNumber", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA35_eot", "[S");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA35", "eot", "[S");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA35_eof", "[S");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA35", "eof", "[S");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA35_min", "[C");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA35", "min", "[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA35_max", "[C");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA35", "max", "[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA35_accept", "[S");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA35", "accept", "[S");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA35_special", "[S");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA35", "special", "[S");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer", "DFA35_transition", "[[S");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/parsing/jpql/antlr/JPQLLexer$DFA35", "transition", "[[S");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDescription", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("1:1: Tokens : ( ABS | ALL | AND | ANY | AS | ASC | AVG | BETWEEN | BOTH | BY | CASE | COALESCE | CONCAT | COUNT | CURRENT_DATE | CURRENT_TIME | CURRENT_TIMESTAMP | DELETE | DESC | DISTINCT | ELSE | EMPTY | END | ENTRY | ESCAPE | EXISTS | FALSE | FETCH | FROM | FUNC | GROUP | HAVING | IN | INDEX | INNER | IS | JOIN | KEY | LEADING | LEFT | LENGTH | LIKE | LOCATE | LOWER | MAX | MEMBER | MIN | MOD | NEW | NOT | NULL | NULLIF | OBJECT | OF | OR | ORDER | OUTER | SELECT | SET | SIZE | SOME | SQRT | SUBSTRING | SUM | THEN | TRAILING | TREAT | TRIM | TRUE | TYPE | UNKNOWN | UPDATE | UPPER | VALUE | WHEN | WHERE | DOT | WS | LEFT_ROUND_BRACKET | LEFT_CURLY_BRACKET | RIGHT_ROUND_BRACKET | RIGHT_CURLY_BRACKET | COMMA | IDENT | HEX_LITERAL | INTEGER_LITERAL | LONG_LITERAL | OCTAL_LITERAL | DOUBLE_LITERAL | FLOAT_LITERAL | DATE_LITERAL | TIME_LITERAL | TIMESTAMP_LITERAL | DATE_STRING | TIME_STRING | EQUALS | GREATER_THAN | GREATER_THAN_EQUAL_TO | LESS_THAN | LESS_THAN_EQUAL_TO | NOT_EQUAL_TO | MULTIPLY | DIVIDE | PLUS | MINUS | POSITIONAL_PARAM | NAMED_PARAM | STRING_LITERAL_DOUBLE_QUOTED | STRING_LITERAL_SINGLE_QUOTED );");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
