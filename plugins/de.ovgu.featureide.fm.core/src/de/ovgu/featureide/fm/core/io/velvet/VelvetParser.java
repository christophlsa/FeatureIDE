// $ANTLR 3.4 Velvet.g 2014-11-03 04:52:33

package de.ovgu.featureide.fm.core.io.velvet;

import de.ovgu.featureide.fm.core.FMCorePlugin;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class VelvetParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ACONSTR", "ATTR", "ATTR_OP_EQUALS", "ATTR_OP_GREATER", "ATTR_OP_GREATER_EQ", "ATTR_OP_LESS", "ATTR_OP_LESS_EQ", "ATTR_OP_NOT_EQUALS", "BASEEXT", "BASESPEC", "BOOLEAN", "CINTERFACE", "COLON", "COMMA", "CONCEPT", "CONSTR", "CONSTRAINT", "DEF", "EMPTY", "END_C", "END_R", "EQ", "ESC_SEQ", "EXPONENT", "FEAT", "FEATURE", "FLOAT", "GROUP", "HEX_DIGIT", "ID", "IDPath", "IMPORTINSTANCE", "IMPORTINTERFACE", "INST", "INT", "INTF", "MANDATORY", "MINUS", "ML_COMMENT", "OCTAL_ESC", "ONEOF", "OPERAND", "OP_AND", "OP_EQUIVALENT", "OP_IMPLIES", "OP_NOT", "OP_OR", "OP_XOR", "PLUS", "SEMI", "SL_COMMENT", "SOMEOF", "START_C", "START_R", "STRING", "UNARYOP", "UNICODE_ESC", "USE", "USES", "VAR_BOOL", "VAR_FLOAT", "VAR_INT", "VAR_STRING", "WS"
    };

    public static final int EOF=-1;
    public static final int ABSTRACT=4;
    public static final int ACONSTR=5;
    public static final int ATTR=6;
    public static final int ATTR_OP_EQUALS=7;
    public static final int ATTR_OP_GREATER=8;
    public static final int ATTR_OP_GREATER_EQ=9;
    public static final int ATTR_OP_LESS=10;
    public static final int ATTR_OP_LESS_EQ=11;
    public static final int ATTR_OP_NOT_EQUALS=12;
    public static final int BASEEXT=13;
    public static final int BASESPEC=14;
    public static final int BOOLEAN=15;
    public static final int CINTERFACE=16;
    public static final int COLON=17;
    public static final int COMMA=18;
    public static final int CONCEPT=19;
    public static final int CONSTR=20;
    public static final int CONSTRAINT=21;
    public static final int DEF=22;
    public static final int EMPTY=23;
    public static final int END_C=24;
    public static final int END_R=25;
    public static final int EQ=26;
    public static final int ESC_SEQ=27;
    public static final int EXPONENT=28;
    public static final int FEAT=29;
    public static final int FEATURE=30;
    public static final int FLOAT=31;
    public static final int GROUP=32;
    public static final int HEX_DIGIT=33;
    public static final int ID=34;
    public static final int IDPath=35;
    public static final int IMPORTINSTANCE=36;
    public static final int IMPORTINTERFACE=37;
    public static final int INST=38;
    public static final int INT=39;
    public static final int INTF=40;
    public static final int MANDATORY=41;
    public static final int MINUS=42;
    public static final int ML_COMMENT=43;
    public static final int OCTAL_ESC=44;
    public static final int ONEOF=45;
    public static final int OPERAND=46;
    public static final int OP_AND=47;
    public static final int OP_EQUIVALENT=48;
    public static final int OP_IMPLIES=49;
    public static final int OP_NOT=50;
    public static final int OP_OR=51;
    public static final int OP_XOR=52;
    public static final int PLUS=53;
    public static final int SEMI=54;
    public static final int SL_COMMENT=55;
    public static final int SOMEOF=56;
    public static final int START_C=57;
    public static final int START_R=58;
    public static final int STRING=59;
    public static final int UNARYOP=60;
    public static final int UNICODE_ESC=61;
    public static final int USE=62;
    public static final int USES=63;
    public static final int VAR_BOOL=64;
    public static final int VAR_FLOAT=65;
    public static final int VAR_INT=66;
    public static final int VAR_STRING=67;
    public static final int WS=68;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public VelvetParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public VelvetParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return VelvetParser.tokenNames; }
    public String getGrammarFileName() { return "Velvet.g"; }


    @Override    
    public void emitErrorMessage(String msg) {
    	FMCorePlugin.getDefault().logError(new Exception(msg));
    }


    public static class velvetModel_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "velvetModel"
    // Velvet.g:80:1: velvetModel : ( concept | cinterface ) EOF ;
    public final VelvetParser.velvetModel_return velvetModel() throws RecognitionException {
        VelvetParser.velvetModel_return retval = new VelvetParser.velvetModel_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token EOF3=null;
        VelvetParser.concept_return concept1 =null;

        VelvetParser.cinterface_return cinterface2 =null;


        Tree EOF3_tree=null;

        try {
            // Velvet.g:81:2: ( ( concept | cinterface ) EOF )
            // Velvet.g:81:4: ( concept | cinterface ) EOF
            {
            root_0 = (Tree)adaptor.nil();


            // Velvet.g:81:4: ( concept | cinterface )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==CONCEPT) ) {
                alt1=1;
            }
            else if ( (LA1_0==CINTERFACE) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Velvet.g:81:5: concept
                    {
                    pushFollow(FOLLOW_concept_in_velvetModel474);
                    concept1=concept();

                    state._fsp--;

                    adaptor.addChild(root_0, concept1.getTree());

                    }
                    break;
                case 2 :
                    // Velvet.g:81:13: cinterface
                    {
                    pushFollow(FOLLOW_cinterface_in_velvetModel476);
                    cinterface2=cinterface();

                    state._fsp--;

                    adaptor.addChild(root_0, cinterface2.getTree());

                    }
                    break;

            }


            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_velvetModel479); 
            EOF3_tree = 
            (Tree)adaptor.create(EOF3)
            ;
            adaptor.addChild(root_0, EOF3_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "velvetModel"


    public static class concept_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "concept"
    // Velvet.g:84:1: concept : CONCEPT ID ( ATTR_OP_LESS conceptBaseSpec ( definitionsSpec )? | ( COLON conceptBaseExt )? ( instanceImports interfaceImports | interfaceImports instanceImports | interfaceImports | instanceImports )? ( definitions )? ) -> ^( CONCEPT ID ( conceptBaseSpec )? ( conceptBaseExt )? ( instanceImports )? ( interfaceImports )? ( definitions )? ) ;
    public final VelvetParser.concept_return concept() throws RecognitionException {
        VelvetParser.concept_return retval = new VelvetParser.concept_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token CONCEPT4=null;
        Token ID5=null;
        Token ATTR_OP_LESS6=null;
        Token COLON9=null;
        VelvetParser.conceptBaseSpec_return conceptBaseSpec7 =null;

        VelvetParser.definitionsSpec_return definitionsSpec8 =null;

        VelvetParser.conceptBaseExt_return conceptBaseExt10 =null;

        VelvetParser.instanceImports_return instanceImports11 =null;

        VelvetParser.interfaceImports_return interfaceImports12 =null;

        VelvetParser.interfaceImports_return interfaceImports13 =null;

        VelvetParser.instanceImports_return instanceImports14 =null;

        VelvetParser.interfaceImports_return interfaceImports15 =null;

        VelvetParser.instanceImports_return instanceImports16 =null;

        VelvetParser.definitions_return definitions17 =null;


        Tree CONCEPT4_tree=null;
        Tree ID5_tree=null;
        Tree ATTR_OP_LESS6_tree=null;
        Tree COLON9_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ATTR_OP_LESS=new RewriteRuleTokenStream(adaptor,"token ATTR_OP_LESS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_CONCEPT=new RewriteRuleTokenStream(adaptor,"token CONCEPT");
        RewriteRuleSubtreeStream stream_conceptBaseExt=new RewriteRuleSubtreeStream(adaptor,"rule conceptBaseExt");
        RewriteRuleSubtreeStream stream_conceptBaseSpec=new RewriteRuleSubtreeStream(adaptor,"rule conceptBaseSpec");
        RewriteRuleSubtreeStream stream_instanceImports=new RewriteRuleSubtreeStream(adaptor,"rule instanceImports");
        RewriteRuleSubtreeStream stream_interfaceImports=new RewriteRuleSubtreeStream(adaptor,"rule interfaceImports");
        RewriteRuleSubtreeStream stream_definitions=new RewriteRuleSubtreeStream(adaptor,"rule definitions");
        RewriteRuleSubtreeStream stream_definitionsSpec=new RewriteRuleSubtreeStream(adaptor,"rule definitionsSpec");
        try {
            // Velvet.g:85:2: ( CONCEPT ID ( ATTR_OP_LESS conceptBaseSpec ( definitionsSpec )? | ( COLON conceptBaseExt )? ( instanceImports interfaceImports | interfaceImports instanceImports | interfaceImports | instanceImports )? ( definitions )? ) -> ^( CONCEPT ID ( conceptBaseSpec )? ( conceptBaseExt )? ( instanceImports )? ( interfaceImports )? ( definitions )? ) )
            // Velvet.g:85:4: CONCEPT ID ( ATTR_OP_LESS conceptBaseSpec ( definitionsSpec )? | ( COLON conceptBaseExt )? ( instanceImports interfaceImports | interfaceImports instanceImports | interfaceImports | instanceImports )? ( definitions )? )
            {
            CONCEPT4=(Token)match(input,CONCEPT,FOLLOW_CONCEPT_in_concept492);  
            stream_CONCEPT.add(CONCEPT4);


            ID5=(Token)match(input,ID,FOLLOW_ID_in_concept494);  
            stream_ID.add(ID5);


            // Velvet.g:86:3: ( ATTR_OP_LESS conceptBaseSpec ( definitionsSpec )? | ( COLON conceptBaseExt )? ( instanceImports interfaceImports | interfaceImports instanceImports | interfaceImports | instanceImports )? ( definitions )? )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ATTR_OP_LESS) ) {
                alt6=1;
            }
            else if ( (LA6_0==EOF||LA6_0==COLON||(LA6_0 >= IMPORTINSTANCE && LA6_0 <= IMPORTINTERFACE)||LA6_0==START_C) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // Velvet.g:86:4: ATTR_OP_LESS conceptBaseSpec ( definitionsSpec )?
                    {
                    ATTR_OP_LESS6=(Token)match(input,ATTR_OP_LESS,FOLLOW_ATTR_OP_LESS_in_concept501);  
                    stream_ATTR_OP_LESS.add(ATTR_OP_LESS6);


                    pushFollow(FOLLOW_conceptBaseSpec_in_concept503);
                    conceptBaseSpec7=conceptBaseSpec();

                    state._fsp--;

                    stream_conceptBaseSpec.add(conceptBaseSpec7.getTree());

                    // Velvet.g:86:33: ( definitionsSpec )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==START_C) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Velvet.g:86:33: definitionsSpec
                            {
                            pushFollow(FOLLOW_definitionsSpec_in_concept505);
                            definitionsSpec8=definitionsSpec();

                            state._fsp--;

                            stream_definitionsSpec.add(definitionsSpec8.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Velvet.g:87:3: ( COLON conceptBaseExt )? ( instanceImports interfaceImports | interfaceImports instanceImports | interfaceImports | instanceImports )? ( definitions )?
                    {
                    // Velvet.g:87:3: ( COLON conceptBaseExt )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==COLON) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // Velvet.g:87:4: COLON conceptBaseExt
                            {
                            COLON9=(Token)match(input,COLON,FOLLOW_COLON_in_concept513);  
                            stream_COLON.add(COLON9);


                            pushFollow(FOLLOW_conceptBaseExt_in_concept515);
                            conceptBaseExt10=conceptBaseExt();

                            state._fsp--;

                            stream_conceptBaseExt.add(conceptBaseExt10.getTree());

                            }
                            break;

                    }


                    // Velvet.g:87:27: ( instanceImports interfaceImports | interfaceImports instanceImports | interfaceImports | instanceImports )?
                    int alt4=5;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // Velvet.g:87:28: instanceImports interfaceImports
                            {
                            pushFollow(FOLLOW_instanceImports_in_concept520);
                            instanceImports11=instanceImports();

                            state._fsp--;

                            stream_instanceImports.add(instanceImports11.getTree());

                            pushFollow(FOLLOW_interfaceImports_in_concept522);
                            interfaceImports12=interfaceImports();

                            state._fsp--;

                            stream_interfaceImports.add(interfaceImports12.getTree());

                            }
                            break;
                        case 2 :
                            // Velvet.g:87:63: interfaceImports instanceImports
                            {
                            pushFollow(FOLLOW_interfaceImports_in_concept526);
                            interfaceImports13=interfaceImports();

                            state._fsp--;

                            stream_interfaceImports.add(interfaceImports13.getTree());

                            pushFollow(FOLLOW_instanceImports_in_concept528);
                            instanceImports14=instanceImports();

                            state._fsp--;

                            stream_instanceImports.add(instanceImports14.getTree());

                            }
                            break;
                        case 3 :
                            // Velvet.g:87:98: interfaceImports
                            {
                            pushFollow(FOLLOW_interfaceImports_in_concept532);
                            interfaceImports15=interfaceImports();

                            state._fsp--;

                            stream_interfaceImports.add(interfaceImports15.getTree());

                            }
                            break;
                        case 4 :
                            // Velvet.g:87:117: instanceImports
                            {
                            pushFollow(FOLLOW_instanceImports_in_concept536);
                            instanceImports16=instanceImports();

                            state._fsp--;

                            stream_instanceImports.add(instanceImports16.getTree());

                            }
                            break;

                    }


                    // Velvet.g:88:3: ( definitions )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==START_C) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Velvet.g:88:3: definitions
                            {
                            pushFollow(FOLLOW_definitions_in_concept543);
                            definitions17=definitions();

                            state._fsp--;

                            stream_definitions.add(definitions17.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: definitions, ID, interfaceImports, conceptBaseExt, instanceImports, CONCEPT, conceptBaseSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 89:2: -> ^( CONCEPT ID ( conceptBaseSpec )? ( conceptBaseExt )? ( instanceImports )? ( interfaceImports )? ( definitions )? )
            {
                // Velvet.g:89:5: ^( CONCEPT ID ( conceptBaseSpec )? ( conceptBaseExt )? ( instanceImports )? ( interfaceImports )? ( definitions )? )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                stream_CONCEPT.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // Velvet.g:89:18: ( conceptBaseSpec )?
                if ( stream_conceptBaseSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_conceptBaseSpec.nextTree());

                }
                stream_conceptBaseSpec.reset();

                // Velvet.g:89:35: ( conceptBaseExt )?
                if ( stream_conceptBaseExt.hasNext() ) {
                    adaptor.addChild(root_1, stream_conceptBaseExt.nextTree());

                }
                stream_conceptBaseExt.reset();

                // Velvet.g:89:51: ( instanceImports )?
                if ( stream_instanceImports.hasNext() ) {
                    adaptor.addChild(root_1, stream_instanceImports.nextTree());

                }
                stream_instanceImports.reset();

                // Velvet.g:89:68: ( interfaceImports )?
                if ( stream_interfaceImports.hasNext() ) {
                    adaptor.addChild(root_1, stream_interfaceImports.nextTree());

                }
                stream_interfaceImports.reset();

                // Velvet.g:89:86: ( definitions )?
                if ( stream_definitions.hasNext() ) {
                    adaptor.addChild(root_1, stream_definitions.nextTree());

                }
                stream_definitions.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "concept"


    public static class conceptBaseExt_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conceptBaseExt"
    // Velvet.g:92:1: conceptBaseExt : ID ( COMMA ID )* -> ^( BASEEXT ( ID )+ ) ;
    public final VelvetParser.conceptBaseExt_return conceptBaseExt() throws RecognitionException {
        VelvetParser.conceptBaseExt_return retval = new VelvetParser.conceptBaseExt_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID18=null;
        Token COMMA19=null;
        Token ID20=null;

        Tree ID18_tree=null;
        Tree COMMA19_tree=null;
        Tree ID20_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        try {
            // Velvet.g:93:2: ( ID ( COMMA ID )* -> ^( BASEEXT ( ID )+ ) )
            // Velvet.g:93:4: ID ( COMMA ID )*
            {
            ID18=(Token)match(input,ID,FOLLOW_ID_in_conceptBaseExt580);  
            stream_ID.add(ID18);


            // Velvet.g:93:7: ( COMMA ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Velvet.g:93:8: COMMA ID
            	    {
            	    COMMA19=(Token)match(input,COMMA,FOLLOW_COMMA_in_conceptBaseExt583);  
            	    stream_COMMA.add(COMMA19);


            	    ID20=(Token)match(input,ID,FOLLOW_ID_in_conceptBaseExt585);  
            	    stream_ID.add(ID20);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 94:2: -> ^( BASEEXT ( ID )+ )
            {
                // Velvet.g:94:5: ^( BASEEXT ( ID )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(BASEEXT, "BASEEXT")
                , root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conceptBaseExt"


    public static class conceptBaseSpec_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conceptBaseSpec"
    // Velvet.g:97:1: conceptBaseSpec : ID ( COMMA ID )* -> ^( BASESPEC ( ID )+ ) ;
    public final VelvetParser.conceptBaseSpec_return conceptBaseSpec() throws RecognitionException {
        VelvetParser.conceptBaseSpec_return retval = new VelvetParser.conceptBaseSpec_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID21=null;
        Token COMMA22=null;
        Token ID23=null;

        Tree ID21_tree=null;
        Tree COMMA22_tree=null;
        Tree ID23_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        try {
            // Velvet.g:98:2: ( ID ( COMMA ID )* -> ^( BASESPEC ( ID )+ ) )
            // Velvet.g:98:4: ID ( COMMA ID )*
            {
            ID21=(Token)match(input,ID,FOLLOW_ID_in_conceptBaseSpec610);  
            stream_ID.add(ID21);


            // Velvet.g:98:7: ( COMMA ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Velvet.g:98:8: COMMA ID
            	    {
            	    COMMA22=(Token)match(input,COMMA,FOLLOW_COMMA_in_conceptBaseSpec613);  
            	    stream_COMMA.add(COMMA22);


            	    ID23=(Token)match(input,ID,FOLLOW_ID_in_conceptBaseSpec615);  
            	    stream_ID.add(ID23);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 99:2: -> ^( BASESPEC ( ID )+ )
            {
                // Velvet.g:99:5: ^( BASESPEC ( ID )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(BASESPEC, "BASESPEC")
                , root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conceptBaseSpec"


    public static class instanceImports_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instanceImports"
    // Velvet.g:102:1: instanceImports : IMPORTINSTANCE ID name ( COMMA ID name )* -> ^( INST ( ID name )+ ) ;
    public final VelvetParser.instanceImports_return instanceImports() throws RecognitionException {
        VelvetParser.instanceImports_return retval = new VelvetParser.instanceImports_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token IMPORTINSTANCE24=null;
        Token ID25=null;
        Token COMMA27=null;
        Token ID28=null;
        VelvetParser.name_return name26 =null;

        VelvetParser.name_return name29 =null;


        Tree IMPORTINSTANCE24_tree=null;
        Tree ID25_tree=null;
        Tree COMMA27_tree=null;
        Tree ID28_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IMPORTINSTANCE=new RewriteRuleTokenStream(adaptor,"token IMPORTINSTANCE");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // Velvet.g:103:2: ( IMPORTINSTANCE ID name ( COMMA ID name )* -> ^( INST ( ID name )+ ) )
            // Velvet.g:103:4: IMPORTINSTANCE ID name ( COMMA ID name )*
            {
            IMPORTINSTANCE24=(Token)match(input,IMPORTINSTANCE,FOLLOW_IMPORTINSTANCE_in_instanceImports639);  
            stream_IMPORTINSTANCE.add(IMPORTINSTANCE24);


            ID25=(Token)match(input,ID,FOLLOW_ID_in_instanceImports641);  
            stream_ID.add(ID25);


            pushFollow(FOLLOW_name_in_instanceImports643);
            name26=name();

            state._fsp--;

            stream_name.add(name26.getTree());

            // Velvet.g:103:27: ( COMMA ID name )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Velvet.g:103:28: COMMA ID name
            	    {
            	    COMMA27=(Token)match(input,COMMA,FOLLOW_COMMA_in_instanceImports646);  
            	    stream_COMMA.add(COMMA27);


            	    ID28=(Token)match(input,ID,FOLLOW_ID_in_instanceImports648);  
            	    stream_ID.add(ID28);


            	    pushFollow(FOLLOW_name_in_instanceImports650);
            	    name29=name();

            	    state._fsp--;

            	    stream_name.add(name29.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // AST REWRITE
            // elements: ID, name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 104:2: -> ^( INST ( ID name )+ )
            {
                // Velvet.g:104:5: ^( INST ( ID name )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(INST, "INST")
                , root_1);

                if ( !(stream_ID.hasNext()||stream_name.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext()||stream_name.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    adaptor.addChild(root_1, stream_name.nextTree());

                }
                stream_ID.reset();
                stream_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instanceImports"


    public static class interfaceImports_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceImports"
    // Velvet.g:107:1: interfaceImports : IMPORTINTERFACE ID name ( COMMA ID name )* -> ^( INTF ( ID name )+ ) ;
    public final VelvetParser.interfaceImports_return interfaceImports() throws RecognitionException {
        VelvetParser.interfaceImports_return retval = new VelvetParser.interfaceImports_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token IMPORTINTERFACE30=null;
        Token ID31=null;
        Token COMMA33=null;
        Token ID34=null;
        VelvetParser.name_return name32 =null;

        VelvetParser.name_return name35 =null;


        Tree IMPORTINTERFACE30_tree=null;
        Tree ID31_tree=null;
        Tree COMMA33_tree=null;
        Tree ID34_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IMPORTINTERFACE=new RewriteRuleTokenStream(adaptor,"token IMPORTINTERFACE");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // Velvet.g:108:2: ( IMPORTINTERFACE ID name ( COMMA ID name )* -> ^( INTF ( ID name )+ ) )
            // Velvet.g:108:4: IMPORTINTERFACE ID name ( COMMA ID name )*
            {
            IMPORTINTERFACE30=(Token)match(input,IMPORTINTERFACE,FOLLOW_IMPORTINTERFACE_in_interfaceImports679);  
            stream_IMPORTINTERFACE.add(IMPORTINTERFACE30);


            ID31=(Token)match(input,ID,FOLLOW_ID_in_interfaceImports681);  
            stream_ID.add(ID31);


            pushFollow(FOLLOW_name_in_interfaceImports683);
            name32=name();

            state._fsp--;

            stream_name.add(name32.getTree());

            // Velvet.g:108:28: ( COMMA ID name )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Velvet.g:108:29: COMMA ID name
            	    {
            	    COMMA33=(Token)match(input,COMMA,FOLLOW_COMMA_in_interfaceImports686);  
            	    stream_COMMA.add(COMMA33);


            	    ID34=(Token)match(input,ID,FOLLOW_ID_in_interfaceImports688);  
            	    stream_ID.add(ID34);


            	    pushFollow(FOLLOW_name_in_interfaceImports690);
            	    name35=name();

            	    state._fsp--;

            	    stream_name.add(name35.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // AST REWRITE
            // elements: ID, name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 109:2: -> ^( INTF ( ID name )+ )
            {
                // Velvet.g:109:5: ^( INTF ( ID name )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(INTF, "INTF")
                , root_1);

                if ( !(stream_ID.hasNext()||stream_name.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext()||stream_name.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    adaptor.addChild(root_1, stream_name.nextTree());

                }
                stream_ID.reset();
                stream_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interfaceImports"


    public static class cinterface_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cinterface"
    // Velvet.g:112:1: cinterface : CINTERFACE ID ( COLON interfaceBaseExt )? definitions -> ^( CINTERFACE ID ( interfaceBaseExt )? definitions ) ;
    public final VelvetParser.cinterface_return cinterface() throws RecognitionException {
        VelvetParser.cinterface_return retval = new VelvetParser.cinterface_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token CINTERFACE36=null;
        Token ID37=null;
        Token COLON38=null;
        VelvetParser.interfaceBaseExt_return interfaceBaseExt39 =null;

        VelvetParser.definitions_return definitions40 =null;


        Tree CINTERFACE36_tree=null;
        Tree ID37_tree=null;
        Tree COLON38_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_CINTERFACE=new RewriteRuleTokenStream(adaptor,"token CINTERFACE");
        RewriteRuleSubtreeStream stream_definitions=new RewriteRuleSubtreeStream(adaptor,"rule definitions");
        RewriteRuleSubtreeStream stream_interfaceBaseExt=new RewriteRuleSubtreeStream(adaptor,"rule interfaceBaseExt");
        try {
            // Velvet.g:112:12: ( CINTERFACE ID ( COLON interfaceBaseExt )? definitions -> ^( CINTERFACE ID ( interfaceBaseExt )? definitions ) )
            // Velvet.g:112:14: CINTERFACE ID ( COLON interfaceBaseExt )? definitions
            {
            CINTERFACE36=(Token)match(input,CINTERFACE,FOLLOW_CINTERFACE_in_cinterface717);  
            stream_CINTERFACE.add(CINTERFACE36);


            ID37=(Token)match(input,ID,FOLLOW_ID_in_cinterface719);  
            stream_ID.add(ID37);


            // Velvet.g:112:29: ( COLON interfaceBaseExt )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==COLON) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Velvet.g:112:30: COLON interfaceBaseExt
                    {
                    COLON38=(Token)match(input,COLON,FOLLOW_COLON_in_cinterface723);  
                    stream_COLON.add(COLON38);


                    pushFollow(FOLLOW_interfaceBaseExt_in_cinterface725);
                    interfaceBaseExt39=interfaceBaseExt();

                    state._fsp--;

                    stream_interfaceBaseExt.add(interfaceBaseExt39.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_definitions_in_cinterface729);
            definitions40=definitions();

            state._fsp--;

            stream_definitions.add(definitions40.getTree());

            // AST REWRITE
            // elements: interfaceBaseExt, CINTERFACE, definitions, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 113:2: -> ^( CINTERFACE ID ( interfaceBaseExt )? definitions )
            {
                // Velvet.g:113:5: ^( CINTERFACE ID ( interfaceBaseExt )? definitions )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                stream_CINTERFACE.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // Velvet.g:113:21: ( interfaceBaseExt )?
                if ( stream_interfaceBaseExt.hasNext() ) {
                    adaptor.addChild(root_1, stream_interfaceBaseExt.nextTree());

                }
                stream_interfaceBaseExt.reset();

                adaptor.addChild(root_1, stream_definitions.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cinterface"


    public static class interfaceBaseExt_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceBaseExt"
    // Velvet.g:116:1: interfaceBaseExt : ID ( COMMA ID )* -> ^( BASEEXT ( ID )+ ) ;
    public final VelvetParser.interfaceBaseExt_return interfaceBaseExt() throws RecognitionException {
        VelvetParser.interfaceBaseExt_return retval = new VelvetParser.interfaceBaseExt_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID41=null;
        Token COMMA42=null;
        Token ID43=null;

        Tree ID41_tree=null;
        Tree COMMA42_tree=null;
        Tree ID43_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        try {
            // Velvet.g:117:2: ( ID ( COMMA ID )* -> ^( BASEEXT ( ID )+ ) )
            // Velvet.g:117:4: ID ( COMMA ID )*
            {
            ID41=(Token)match(input,ID,FOLLOW_ID_in_interfaceBaseExt756);  
            stream_ID.add(ID41);


            // Velvet.g:117:7: ( COMMA ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Velvet.g:117:8: COMMA ID
            	    {
            	    COMMA42=(Token)match(input,COMMA,FOLLOW_COMMA_in_interfaceBaseExt759);  
            	    stream_COMMA.add(COMMA42);


            	    ID43=(Token)match(input,ID,FOLLOW_ID_in_interfaceBaseExt761);  
            	    stream_ID.add(ID43);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 118:2: -> ^( BASEEXT ( ID )+ )
            {
                // Velvet.g:118:5: ^( BASEEXT ( ID )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(BASEEXT, "BASEEXT")
                , root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interfaceBaseExt"


    public static class name_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // Velvet.g:121:1: name : ( ID | IDPath );
    public final VelvetParser.name_return name() throws RecognitionException {
        VelvetParser.name_return retval = new VelvetParser.name_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set44=null;

        Tree set44_tree=null;

        try {
            // Velvet.g:121:5: ( ID | IDPath )
            // Velvet.g:
            {
            root_0 = (Tree)adaptor.nil();


            set44=(Token)input.LT(1);

            if ( (input.LA(1) >= ID && input.LA(1) <= IDPath) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(set44)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "name"


    public static class definitions_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "definitions"
    // Velvet.g:125:1: definitions : START_C definition END_C -> ^( DEF ( definition )? EMPTY ) ;
    public final VelvetParser.definitions_return definitions() throws RecognitionException {
        VelvetParser.definitions_return retval = new VelvetParser.definitions_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token START_C45=null;
        Token END_C47=null;
        VelvetParser.definition_return definition46 =null;


        Tree START_C45_tree=null;
        Tree END_C47_tree=null;
        RewriteRuleTokenStream stream_END_C=new RewriteRuleTokenStream(adaptor,"token END_C");
        RewriteRuleTokenStream stream_START_C=new RewriteRuleTokenStream(adaptor,"token START_C");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        try {
            // Velvet.g:126:2: ( START_C definition END_C -> ^( DEF ( definition )? EMPTY ) )
            // Velvet.g:126:4: START_C definition END_C
            {
            START_C45=(Token)match(input,START_C,FOLLOW_START_C_in_definitions801);  
            stream_START_C.add(START_C45);


            pushFollow(FOLLOW_definition_in_definitions803);
            definition46=definition();

            state._fsp--;

            stream_definition.add(definition46.getTree());

            END_C47=(Token)match(input,END_C,FOLLOW_END_C_in_definitions805);  
            stream_END_C.add(END_C47);


            // AST REWRITE
            // elements: definition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 127:2: -> ^( DEF ( definition )? EMPTY )
            {
                // Velvet.g:127:5: ^( DEF ( definition )? EMPTY )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(DEF, "DEF")
                , root_1);

                // Velvet.g:127:11: ( definition )?
                if ( stream_definition.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition.nextTree());

                }
                stream_definition.reset();

                adaptor.addChild(root_1, 
                (Tree)adaptor.create(EMPTY, "EMPTY")
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "definitions"


    public static class definitionsSpec_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "definitionsSpec"
    // Velvet.g:130:1: definitionsSpec : START_C ( constraint )+ END_C -> ^( DEF ( constraint )+ EMPTY ) ;
    public final VelvetParser.definitionsSpec_return definitionsSpec() throws RecognitionException {
        VelvetParser.definitionsSpec_return retval = new VelvetParser.definitionsSpec_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token START_C48=null;
        Token END_C50=null;
        VelvetParser.constraint_return constraint49 =null;


        Tree START_C48_tree=null;
        Tree END_C50_tree=null;
        RewriteRuleTokenStream stream_END_C=new RewriteRuleTokenStream(adaptor,"token END_C");
        RewriteRuleTokenStream stream_START_C=new RewriteRuleTokenStream(adaptor,"token START_C");
        RewriteRuleSubtreeStream stream_constraint=new RewriteRuleSubtreeStream(adaptor,"rule constraint");
        try {
            // Velvet.g:131:2: ( START_C ( constraint )+ END_C -> ^( DEF ( constraint )+ EMPTY ) )
            // Velvet.g:131:4: START_C ( constraint )+ END_C
            {
            START_C48=(Token)match(input,START_C,FOLLOW_START_C_in_definitionsSpec828);  
            stream_START_C.add(START_C48);


            // Velvet.g:131:12: ( constraint )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==CONSTRAINT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Velvet.g:131:12: constraint
            	    {
            	    pushFollow(FOLLOW_constraint_in_definitionsSpec830);
            	    constraint49=constraint();

            	    state._fsp--;

            	    stream_constraint.add(constraint49.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            END_C50=(Token)match(input,END_C,FOLLOW_END_C_in_definitionsSpec833);  
            stream_END_C.add(END_C50);


            // AST REWRITE
            // elements: constraint
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 132:2: -> ^( DEF ( constraint )+ EMPTY )
            {
                // Velvet.g:132:5: ^( DEF ( constraint )+ EMPTY )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(DEF, "DEF")
                , root_1);

                if ( !(stream_constraint.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_constraint.hasNext() ) {
                    adaptor.addChild(root_1, stream_constraint.nextTree());

                }
                stream_constraint.reset();

                adaptor.addChild(root_1, 
                (Tree)adaptor.create(EMPTY, "EMPTY")
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "definitionsSpec"


    public static class definition_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "definition"
    // Velvet.g:135:1: definition : ( nonFeatureDefinition )* ( ( featureGroup ( nonFeatureDefinition )* ) | ( feature ( feature | nonFeatureDefinition )* ) )? ;
    public final VelvetParser.definition_return definition() throws RecognitionException {
        VelvetParser.definition_return retval = new VelvetParser.definition_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        VelvetParser.nonFeatureDefinition_return nonFeatureDefinition51 =null;

        VelvetParser.featureGroup_return featureGroup52 =null;

        VelvetParser.nonFeatureDefinition_return nonFeatureDefinition53 =null;

        VelvetParser.feature_return feature54 =null;

        VelvetParser.feature_return feature55 =null;

        VelvetParser.nonFeatureDefinition_return nonFeatureDefinition56 =null;



        try {
            // Velvet.g:136:2: ( ( nonFeatureDefinition )* ( ( featureGroup ( nonFeatureDefinition )* ) | ( feature ( feature | nonFeatureDefinition )* ) )? )
            // Velvet.g:136:4: ( nonFeatureDefinition )* ( ( featureGroup ( nonFeatureDefinition )* ) | ( feature ( feature | nonFeatureDefinition )* ) )?
            {
            root_0 = (Tree)adaptor.nil();


            // Velvet.g:136:4: ( nonFeatureDefinition )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==CONSTRAINT||LA14_0==USE||(LA14_0 >= VAR_BOOL && LA14_0 <= VAR_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Velvet.g:136:4: nonFeatureDefinition
            	    {
            	    pushFollow(FOLLOW_nonFeatureDefinition_in_definition857);
            	    nonFeatureDefinition51=nonFeatureDefinition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nonFeatureDefinition51.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // Velvet.g:136:26: ( ( featureGroup ( nonFeatureDefinition )* ) | ( feature ( feature | nonFeatureDefinition )* ) )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ONEOF||LA17_0==SOMEOF) ) {
                alt17=1;
            }
            else if ( (LA17_0==ABSTRACT||LA17_0==FEATURE||LA17_0==MANDATORY) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // Velvet.g:137:3: ( featureGroup ( nonFeatureDefinition )* )
                    {
                    // Velvet.g:137:3: ( featureGroup ( nonFeatureDefinition )* )
                    // Velvet.g:137:4: featureGroup ( nonFeatureDefinition )*
                    {
                    pushFollow(FOLLOW_featureGroup_in_definition865);
                    featureGroup52=featureGroup();

                    state._fsp--;

                    adaptor.addChild(root_0, featureGroup52.getTree());

                    // Velvet.g:137:17: ( nonFeatureDefinition )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==CONSTRAINT||LA15_0==USE||(LA15_0 >= VAR_BOOL && LA15_0 <= VAR_STRING)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Velvet.g:137:17: nonFeatureDefinition
                    	    {
                    	    pushFollow(FOLLOW_nonFeatureDefinition_in_definition867);
                    	    nonFeatureDefinition53=nonFeatureDefinition();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, nonFeatureDefinition53.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // Velvet.g:138:3: ( feature ( feature | nonFeatureDefinition )* )
                    {
                    // Velvet.g:138:3: ( feature ( feature | nonFeatureDefinition )* )
                    // Velvet.g:138:4: feature ( feature | nonFeatureDefinition )*
                    {
                    pushFollow(FOLLOW_feature_in_definition876);
                    feature54=feature();

                    state._fsp--;

                    adaptor.addChild(root_0, feature54.getTree());

                    // Velvet.g:138:12: ( feature | nonFeatureDefinition )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==ABSTRACT||LA16_0==FEATURE||LA16_0==MANDATORY) ) {
                            alt16=1;
                        }
                        else if ( (LA16_0==CONSTRAINT||LA16_0==USE||(LA16_0 >= VAR_BOOL && LA16_0 <= VAR_STRING)) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Velvet.g:138:13: feature
                    	    {
                    	    pushFollow(FOLLOW_feature_in_definition879);
                    	    feature55=feature();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, feature55.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // Velvet.g:138:23: nonFeatureDefinition
                    	    {
                    	    pushFollow(FOLLOW_nonFeatureDefinition_in_definition883);
                    	    nonFeatureDefinition56=nonFeatureDefinition();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, nonFeatureDefinition56.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "definition"


    public static class nonFeatureDefinition_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nonFeatureDefinition"
    // Velvet.g:142:1: nonFeatureDefinition : ( constraint | use | attribute );
    public final VelvetParser.nonFeatureDefinition_return nonFeatureDefinition() throws RecognitionException {
        VelvetParser.nonFeatureDefinition_return retval = new VelvetParser.nonFeatureDefinition_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        VelvetParser.constraint_return constraint57 =null;

        VelvetParser.use_return use58 =null;

        VelvetParser.attribute_return attribute59 =null;



        try {
            // Velvet.g:143:2: ( constraint | use | attribute )
            int alt18=3;
            switch ( input.LA(1) ) {
            case CONSTRAINT:
                {
                alt18=1;
                }
                break;
            case USE:
                {
                alt18=2;
                }
                break;
            case VAR_BOOL:
            case VAR_FLOAT:
            case VAR_INT:
            case VAR_STRING:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // Velvet.g:143:4: constraint
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_constraint_in_nonFeatureDefinition905);
                    constraint57=constraint();

                    state._fsp--;

                    adaptor.addChild(root_0, constraint57.getTree());

                    }
                    break;
                case 2 :
                    // Velvet.g:144:4: use
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_use_in_nonFeatureDefinition910);
                    use58=use();

                    state._fsp--;

                    adaptor.addChild(root_0, use58.getTree());

                    }
                    break;
                case 3 :
                    // Velvet.g:145:4: attribute
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_attribute_in_nonFeatureDefinition915);
                    attribute59=attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute59.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nonFeatureDefinition"


    public static class use_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "use"
    // Velvet.g:148:1: use : USE name SEMI -> ^( USES name ) ;
    public final VelvetParser.use_return use() throws RecognitionException {
        VelvetParser.use_return retval = new VelvetParser.use_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token USE60=null;
        Token SEMI62=null;
        VelvetParser.name_return name61 =null;


        Tree USE60_tree=null;
        Tree SEMI62_tree=null;
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // Velvet.g:148:5: ( USE name SEMI -> ^( USES name ) )
            // Velvet.g:148:7: USE name SEMI
            {
            USE60=(Token)match(input,USE,FOLLOW_USE_in_use927);  
            stream_USE.add(USE60);


            pushFollow(FOLLOW_name_in_use929);
            name61=name();

            state._fsp--;

            stream_name.add(name61.getTree());

            SEMI62=(Token)match(input,SEMI,FOLLOW_SEMI_in_use931);  
            stream_SEMI.add(SEMI62);


            // AST REWRITE
            // elements: name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 149:2: -> ^( USES name )
            {
                // Velvet.g:149:5: ^( USES name )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(USES, "USES")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "use"


    public static class feature_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "feature"
    // Velvet.g:152:1: feature : ( MANDATORY ABSTRACT | ABSTRACT MANDATORY | MANDATORY | ABSTRACT )? FEATURE name ( definitions | SEMI ) -> ^( FEAT name ( MANDATORY )? ( ABSTRACT )? ( definitions )? ) ;
    public final VelvetParser.feature_return feature() throws RecognitionException {
        VelvetParser.feature_return retval = new VelvetParser.feature_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token MANDATORY63=null;
        Token ABSTRACT64=null;
        Token ABSTRACT65=null;
        Token MANDATORY66=null;
        Token MANDATORY67=null;
        Token ABSTRACT68=null;
        Token FEATURE69=null;
        Token SEMI72=null;
        VelvetParser.name_return name70 =null;

        VelvetParser.definitions_return definitions71 =null;


        Tree MANDATORY63_tree=null;
        Tree ABSTRACT64_tree=null;
        Tree ABSTRACT65_tree=null;
        Tree MANDATORY66_tree=null;
        Tree MANDATORY67_tree=null;
        Tree ABSTRACT68_tree=null;
        Tree FEATURE69_tree=null;
        Tree SEMI72_tree=null;
        RewriteRuleTokenStream stream_ABSTRACT=new RewriteRuleTokenStream(adaptor,"token ABSTRACT");
        RewriteRuleTokenStream stream_MANDATORY=new RewriteRuleTokenStream(adaptor,"token MANDATORY");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_FEATURE=new RewriteRuleTokenStream(adaptor,"token FEATURE");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_definitions=new RewriteRuleSubtreeStream(adaptor,"rule definitions");
        try {
            // Velvet.g:153:2: ( ( MANDATORY ABSTRACT | ABSTRACT MANDATORY | MANDATORY | ABSTRACT )? FEATURE name ( definitions | SEMI ) -> ^( FEAT name ( MANDATORY )? ( ABSTRACT )? ( definitions )? ) )
            // Velvet.g:153:4: ( MANDATORY ABSTRACT | ABSTRACT MANDATORY | MANDATORY | ABSTRACT )? FEATURE name ( definitions | SEMI )
            {
            // Velvet.g:153:4: ( MANDATORY ABSTRACT | ABSTRACT MANDATORY | MANDATORY | ABSTRACT )?
            int alt19=5;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==MANDATORY) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==ABSTRACT) ) {
                    alt19=1;
                }
                else if ( (LA19_1==FEATURE) ) {
                    alt19=3;
                }
            }
            else if ( (LA19_0==ABSTRACT) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==MANDATORY) ) {
                    alt19=2;
                }
                else if ( (LA19_2==FEATURE) ) {
                    alt19=4;
                }
            }
            switch (alt19) {
                case 1 :
                    // Velvet.g:153:5: MANDATORY ABSTRACT
                    {
                    MANDATORY63=(Token)match(input,MANDATORY,FOLLOW_MANDATORY_in_feature952);  
                    stream_MANDATORY.add(MANDATORY63);


                    ABSTRACT64=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_feature954);  
                    stream_ABSTRACT.add(ABSTRACT64);


                    }
                    break;
                case 2 :
                    // Velvet.g:153:26: ABSTRACT MANDATORY
                    {
                    ABSTRACT65=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_feature958);  
                    stream_ABSTRACT.add(ABSTRACT65);


                    MANDATORY66=(Token)match(input,MANDATORY,FOLLOW_MANDATORY_in_feature960);  
                    stream_MANDATORY.add(MANDATORY66);


                    }
                    break;
                case 3 :
                    // Velvet.g:153:47: MANDATORY
                    {
                    MANDATORY67=(Token)match(input,MANDATORY,FOLLOW_MANDATORY_in_feature964);  
                    stream_MANDATORY.add(MANDATORY67);


                    }
                    break;
                case 4 :
                    // Velvet.g:153:59: ABSTRACT
                    {
                    ABSTRACT68=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_feature968);  
                    stream_ABSTRACT.add(ABSTRACT68);


                    }
                    break;

            }


            FEATURE69=(Token)match(input,FEATURE,FOLLOW_FEATURE_in_feature975);  
            stream_FEATURE.add(FEATURE69);


            pushFollow(FOLLOW_name_in_feature977);
            name70=name();

            state._fsp--;

            stream_name.add(name70.getTree());

            // Velvet.g:154:17: ( definitions | SEMI )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==START_C) ) {
                alt20=1;
            }
            else if ( (LA20_0==SEMI) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // Velvet.g:154:18: definitions
                    {
                    pushFollow(FOLLOW_definitions_in_feature980);
                    definitions71=definitions();

                    state._fsp--;

                    stream_definitions.add(definitions71.getTree());

                    }
                    break;
                case 2 :
                    // Velvet.g:154:32: SEMI
                    {
                    SEMI72=(Token)match(input,SEMI,FOLLOW_SEMI_in_feature984);  
                    stream_SEMI.add(SEMI72);


                    }
                    break;

            }


            // AST REWRITE
            // elements: definitions, name, ABSTRACT, MANDATORY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 155:2: -> ^( FEAT name ( MANDATORY )? ( ABSTRACT )? ( definitions )? )
            {
                // Velvet.g:155:5: ^( FEAT name ( MANDATORY )? ( ABSTRACT )? ( definitions )? )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(FEAT, "FEAT")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextTree());

                // Velvet.g:155:17: ( MANDATORY )?
                if ( stream_MANDATORY.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_MANDATORY.nextNode()
                    );

                }
                stream_MANDATORY.reset();

                // Velvet.g:155:28: ( ABSTRACT )?
                if ( stream_ABSTRACT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ABSTRACT.nextNode()
                    );

                }
                stream_ABSTRACT.reset();

                // Velvet.g:155:38: ( definitions )?
                if ( stream_definitions.hasNext() ) {
                    adaptor.addChild(root_1, stream_definitions.nextTree());

                }
                stream_definitions.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "feature"


    public static class featureGroup_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "featureGroup"
    // Velvet.g:158:1: featureGroup : groupType START_C ( feature )+ END_C -> ^( GROUP groupType ( feature )+ ) ;
    public final VelvetParser.featureGroup_return featureGroup() throws RecognitionException {
        VelvetParser.featureGroup_return retval = new VelvetParser.featureGroup_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token START_C74=null;
        Token END_C76=null;
        VelvetParser.groupType_return groupType73 =null;

        VelvetParser.feature_return feature75 =null;


        Tree START_C74_tree=null;
        Tree END_C76_tree=null;
        RewriteRuleTokenStream stream_END_C=new RewriteRuleTokenStream(adaptor,"token END_C");
        RewriteRuleTokenStream stream_START_C=new RewriteRuleTokenStream(adaptor,"token START_C");
        RewriteRuleSubtreeStream stream_groupType=new RewriteRuleSubtreeStream(adaptor,"rule groupType");
        RewriteRuleSubtreeStream stream_feature=new RewriteRuleSubtreeStream(adaptor,"rule feature");
        try {
            // Velvet.g:159:2: ( groupType START_C ( feature )+ END_C -> ^( GROUP groupType ( feature )+ ) )
            // Velvet.g:159:4: groupType START_C ( feature )+ END_C
            {
            pushFollow(FOLLOW_groupType_in_featureGroup1015);
            groupType73=groupType();

            state._fsp--;

            stream_groupType.add(groupType73.getTree());

            START_C74=(Token)match(input,START_C,FOLLOW_START_C_in_featureGroup1017);  
            stream_START_C.add(START_C74);


            // Velvet.g:159:22: ( feature )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ABSTRACT||LA21_0==FEATURE||LA21_0==MANDATORY) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Velvet.g:159:22: feature
            	    {
            	    pushFollow(FOLLOW_feature_in_featureGroup1019);
            	    feature75=feature();

            	    state._fsp--;

            	    stream_feature.add(feature75.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            END_C76=(Token)match(input,END_C,FOLLOW_END_C_in_featureGroup1022);  
            stream_END_C.add(END_C76);


            // AST REWRITE
            // elements: feature, groupType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 160:2: -> ^( GROUP groupType ( feature )+ )
            {
                // Velvet.g:160:5: ^( GROUP groupType ( feature )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(GROUP, "GROUP")
                , root_1);

                adaptor.addChild(root_1, stream_groupType.nextTree());

                if ( !(stream_feature.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_feature.hasNext() ) {
                    adaptor.addChild(root_1, stream_feature.nextTree());

                }
                stream_feature.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "featureGroup"


    public static class groupType_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupType"
    // Velvet.g:163:1: groupType : ( SOMEOF | ONEOF );
    public final VelvetParser.groupType_return groupType() throws RecognitionException {
        VelvetParser.groupType_return retval = new VelvetParser.groupType_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set77=null;

        Tree set77_tree=null;

        try {
            // Velvet.g:164:2: ( SOMEOF | ONEOF )
            // Velvet.g:
            {
            root_0 = (Tree)adaptor.nil();


            set77=(Token)input.LT(1);

            if ( input.LA(1)==ONEOF||input.LA(1)==SOMEOF ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(set77)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupType"


    public static class constraint_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constraint"
    // Velvet.g:168:1: constraint : CONSTRAINT ^ ( ID EQ !)? ( constraintDefinition | attributeConstraint ) SEMI !;
    public final VelvetParser.constraint_return constraint() throws RecognitionException {
        VelvetParser.constraint_return retval = new VelvetParser.constraint_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token CONSTRAINT78=null;
        Token ID79=null;
        Token EQ80=null;
        Token SEMI83=null;
        VelvetParser.constraintDefinition_return constraintDefinition81 =null;

        VelvetParser.attributeConstraint_return attributeConstraint82 =null;


        Tree CONSTRAINT78_tree=null;
        Tree ID79_tree=null;
        Tree EQ80_tree=null;
        Tree SEMI83_tree=null;

        try {
            // Velvet.g:169:2: ( CONSTRAINT ^ ( ID EQ !)? ( constraintDefinition | attributeConstraint ) SEMI !)
            // Velvet.g:169:4: CONSTRAINT ^ ( ID EQ !)? ( constraintDefinition | attributeConstraint ) SEMI !
            {
            root_0 = (Tree)adaptor.nil();


            CONSTRAINT78=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint1063); 
            CONSTRAINT78_tree = 
            (Tree)adaptor.create(CONSTRAINT78)
            ;
            root_0 = (Tree)adaptor.becomeRoot(CONSTRAINT78_tree, root_0);


            // Velvet.g:169:16: ( ID EQ !)?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EQ) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // Velvet.g:169:17: ID EQ !
                    {
                    ID79=(Token)match(input,ID,FOLLOW_ID_in_constraint1067); 
                    ID79_tree = 
                    (Tree)adaptor.create(ID79)
                    ;
                    adaptor.addChild(root_0, ID79_tree);


                    EQ80=(Token)match(input,EQ,FOLLOW_EQ_in_constraint1069); 

                    }
                    break;

            }


            // Velvet.g:169:26: ( constraintDefinition | attributeConstraint )
            int alt23=2;
            switch ( input.LA(1) ) {
            case OP_NOT:
            case START_R:
                {
                alt23=1;
                }
                break;
            case ID:
            case IDPath:
                {
                int LA23_2 = input.LA(2);

                if ( ((LA23_2 >= OP_AND && LA23_2 <= OP_IMPLIES)||(LA23_2 >= OP_OR && LA23_2 <= OP_XOR)||LA23_2==SEMI) ) {
                    alt23=1;
                }
                else if ( (LA23_2==ATTR_OP_EQUALS||LA23_2==ATTR_OP_GREATER_EQ||LA23_2==ATTR_OP_LESS_EQ||LA23_2==MINUS||LA23_2==PLUS) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt23=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // Velvet.g:169:27: constraintDefinition
                    {
                    pushFollow(FOLLOW_constraintDefinition_in_constraint1075);
                    constraintDefinition81=constraintDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, constraintDefinition81.getTree());

                    }
                    break;
                case 2 :
                    // Velvet.g:169:50: attributeConstraint
                    {
                    pushFollow(FOLLOW_attributeConstraint_in_constraint1079);
                    attributeConstraint82=attributeConstraint();

                    state._fsp--;

                    adaptor.addChild(root_0, attributeConstraint82.getTree());

                    }
                    break;

            }


            SEMI83=(Token)match(input,SEMI,FOLLOW_SEMI_in_constraint1082); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constraint"


    public static class constraintDefinition_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constraintDefinition"
    // Velvet.g:172:1: constraintDefinition : constraintOperand ( binaryOp constraintOperand )* -> ^( CONSTR ( constraintOperand )+ ( binaryOp )* ) ;
    public final VelvetParser.constraintDefinition_return constraintDefinition() throws RecognitionException {
        VelvetParser.constraintDefinition_return retval = new VelvetParser.constraintDefinition_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        VelvetParser.constraintOperand_return constraintOperand84 =null;

        VelvetParser.binaryOp_return binaryOp85 =null;

        VelvetParser.constraintOperand_return constraintOperand86 =null;


        RewriteRuleSubtreeStream stream_constraintOperand=new RewriteRuleSubtreeStream(adaptor,"rule constraintOperand");
        RewriteRuleSubtreeStream stream_binaryOp=new RewriteRuleSubtreeStream(adaptor,"rule binaryOp");
        try {
            // Velvet.g:173:2: ( constraintOperand ( binaryOp constraintOperand )* -> ^( CONSTR ( constraintOperand )+ ( binaryOp )* ) )
            // Velvet.g:173:4: constraintOperand ( binaryOp constraintOperand )*
            {
            pushFollow(FOLLOW_constraintOperand_in_constraintDefinition1095);
            constraintOperand84=constraintOperand();

            state._fsp--;

            stream_constraintOperand.add(constraintOperand84.getTree());

            // Velvet.g:173:22: ( binaryOp constraintOperand )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0 >= OP_AND && LA24_0 <= OP_IMPLIES)||(LA24_0 >= OP_OR && LA24_0 <= OP_XOR)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Velvet.g:173:23: binaryOp constraintOperand
            	    {
            	    pushFollow(FOLLOW_binaryOp_in_constraintDefinition1098);
            	    binaryOp85=binaryOp();

            	    state._fsp--;

            	    stream_binaryOp.add(binaryOp85.getTree());

            	    pushFollow(FOLLOW_constraintOperand_in_constraintDefinition1100);
            	    constraintOperand86=constraintOperand();

            	    state._fsp--;

            	    stream_constraintOperand.add(constraintOperand86.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            // AST REWRITE
            // elements: binaryOp, constraintOperand
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 174:2: -> ^( CONSTR ( constraintOperand )+ ( binaryOp )* )
            {
                // Velvet.g:174:5: ^( CONSTR ( constraintOperand )+ ( binaryOp )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(CONSTR, "CONSTR")
                , root_1);

                if ( !(stream_constraintOperand.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_constraintOperand.hasNext() ) {
                    adaptor.addChild(root_1, stream_constraintOperand.nextTree());

                }
                stream_constraintOperand.reset();

                // Velvet.g:174:33: ( binaryOp )*
                while ( stream_binaryOp.hasNext() ) {
                    adaptor.addChild(root_1, stream_binaryOp.nextTree());

                }
                stream_binaryOp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constraintDefinition"


    public static class constraintOperand_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constraintOperand"
    // Velvet.g:177:1: constraintOperand : ( unaryOp )* ( START_R constraintDefinition END_R | name ) -> ( constraintDefinition )? ( ^( UNARYOP unaryOp ) )* ( ^( OPERAND name ) )? ;
    public final VelvetParser.constraintOperand_return constraintOperand() throws RecognitionException {
        VelvetParser.constraintOperand_return retval = new VelvetParser.constraintOperand_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token START_R88=null;
        Token END_R90=null;
        VelvetParser.unaryOp_return unaryOp87 =null;

        VelvetParser.constraintDefinition_return constraintDefinition89 =null;

        VelvetParser.name_return name91 =null;


        Tree START_R88_tree=null;
        Tree END_R90_tree=null;
        RewriteRuleTokenStream stream_END_R=new RewriteRuleTokenStream(adaptor,"token END_R");
        RewriteRuleTokenStream stream_START_R=new RewriteRuleTokenStream(adaptor,"token START_R");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_unaryOp=new RewriteRuleSubtreeStream(adaptor,"rule unaryOp");
        RewriteRuleSubtreeStream stream_constraintDefinition=new RewriteRuleSubtreeStream(adaptor,"rule constraintDefinition");
        try {
            // Velvet.g:177:19: ( ( unaryOp )* ( START_R constraintDefinition END_R | name ) -> ( constraintDefinition )? ( ^( UNARYOP unaryOp ) )* ( ^( OPERAND name ) )? )
            // Velvet.g:177:21: ( unaryOp )* ( START_R constraintDefinition END_R | name )
            {
            // Velvet.g:177:21: ( unaryOp )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==OP_NOT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Velvet.g:177:21: unaryOp
            	    {
            	    pushFollow(FOLLOW_unaryOp_in_constraintOperand1127);
            	    unaryOp87=unaryOp();

            	    state._fsp--;

            	    stream_unaryOp.add(unaryOp87.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            // Velvet.g:177:30: ( START_R constraintDefinition END_R | name )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==START_R) ) {
                alt26=1;
            }
            else if ( ((LA26_0 >= ID && LA26_0 <= IDPath)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // Velvet.g:177:31: START_R constraintDefinition END_R
                    {
                    START_R88=(Token)match(input,START_R,FOLLOW_START_R_in_constraintOperand1131);  
                    stream_START_R.add(START_R88);


                    pushFollow(FOLLOW_constraintDefinition_in_constraintOperand1133);
                    constraintDefinition89=constraintDefinition();

                    state._fsp--;

                    stream_constraintDefinition.add(constraintDefinition89.getTree());

                    END_R90=(Token)match(input,END_R,FOLLOW_END_R_in_constraintOperand1135);  
                    stream_END_R.add(END_R90);


                    }
                    break;
                case 2 :
                    // Velvet.g:177:68: name
                    {
                    pushFollow(FOLLOW_name_in_constraintOperand1139);
                    name91=name();

                    state._fsp--;

                    stream_name.add(name91.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: name, unaryOp, constraintDefinition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 178:2: -> ( constraintDefinition )? ( ^( UNARYOP unaryOp ) )* ( ^( OPERAND name ) )?
            {
                // Velvet.g:178:5: ( constraintDefinition )?
                if ( stream_constraintDefinition.hasNext() ) {
                    adaptor.addChild(root_0, stream_constraintDefinition.nextTree());

                }
                stream_constraintDefinition.reset();

                // Velvet.g:178:27: ( ^( UNARYOP unaryOp ) )*
                while ( stream_unaryOp.hasNext() ) {
                    // Velvet.g:178:27: ^( UNARYOP unaryOp )
                    {
                    Tree root_1 = (Tree)adaptor.nil();
                    root_1 = (Tree)adaptor.becomeRoot(
                    (Tree)adaptor.create(UNARYOP, "UNARYOP")
                    , root_1);

                    adaptor.addChild(root_1, stream_unaryOp.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_unaryOp.reset();

                // Velvet.g:178:47: ( ^( OPERAND name ) )?
                if ( stream_name.hasNext() ) {
                    // Velvet.g:178:47: ^( OPERAND name )
                    {
                    Tree root_1 = (Tree)adaptor.nil();
                    root_1 = (Tree)adaptor.becomeRoot(
                    (Tree)adaptor.create(OPERAND, "OPERAND")
                    , root_1);

                    adaptor.addChild(root_1, stream_name.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_name.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constraintOperand"


    public static class attributeConstraint_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attributeConstraint"
    // Velvet.g:181:1: attributeConstraint : attribConstraint -> ^( ACONSTR attribConstraint ) ;
    public final VelvetParser.attributeConstraint_return attributeConstraint() throws RecognitionException {
        VelvetParser.attributeConstraint_return retval = new VelvetParser.attributeConstraint_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        VelvetParser.attribConstraint_return attribConstraint92 =null;


        RewriteRuleSubtreeStream stream_attribConstraint=new RewriteRuleSubtreeStream(adaptor,"rule attribConstraint");
        try {
            // Velvet.g:182:2: ( attribConstraint -> ^( ACONSTR attribConstraint ) )
            // Velvet.g:182:4: attribConstraint
            {
            pushFollow(FOLLOW_attribConstraint_in_attributeConstraint1174);
            attribConstraint92=attribConstraint();

            state._fsp--;

            stream_attribConstraint.add(attribConstraint92.getTree());

            // AST REWRITE
            // elements: attribConstraint
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 183:2: -> ^( ACONSTR attribConstraint )
            {
                // Velvet.g:183:5: ^( ACONSTR attribConstraint )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(ACONSTR, "ACONSTR")
                , root_1);

                adaptor.addChild(root_1, stream_attribConstraint.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attributeConstraint"


    public static class attribConstraint_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribConstraint"
    // Velvet.g:186:1: attribConstraint : attribNumInstance ( attribOperator attribNumInstance )* attribRelation attribNumInstance ( attribOperator attribNumInstance )* ;
    public final VelvetParser.attribConstraint_return attribConstraint() throws RecognitionException {
        VelvetParser.attribConstraint_return retval = new VelvetParser.attribConstraint_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        VelvetParser.attribNumInstance_return attribNumInstance93 =null;

        VelvetParser.attribOperator_return attribOperator94 =null;

        VelvetParser.attribNumInstance_return attribNumInstance95 =null;

        VelvetParser.attribRelation_return attribRelation96 =null;

        VelvetParser.attribNumInstance_return attribNumInstance97 =null;

        VelvetParser.attribOperator_return attribOperator98 =null;

        VelvetParser.attribNumInstance_return attribNumInstance99 =null;



        try {
            // Velvet.g:187:2: ( attribNumInstance ( attribOperator attribNumInstance )* attribRelation attribNumInstance ( attribOperator attribNumInstance )* )
            // Velvet.g:187:4: attribNumInstance ( attribOperator attribNumInstance )* attribRelation attribNumInstance ( attribOperator attribNumInstance )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_attribNumInstance_in_attribConstraint1194);
            attribNumInstance93=attribNumInstance();

            state._fsp--;

            adaptor.addChild(root_0, attribNumInstance93.getTree());

            // Velvet.g:187:22: ( attribOperator attribNumInstance )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==MINUS||LA27_0==PLUS) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Velvet.g:187:23: attribOperator attribNumInstance
            	    {
            	    pushFollow(FOLLOW_attribOperator_in_attribConstraint1197);
            	    attribOperator94=attribOperator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribOperator94.getTree());

            	    pushFollow(FOLLOW_attribNumInstance_in_attribConstraint1199);
            	    attribNumInstance95=attribNumInstance();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribNumInstance95.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            pushFollow(FOLLOW_attribRelation_in_attribConstraint1207);
            attribRelation96=attribRelation();

            state._fsp--;

            adaptor.addChild(root_0, attribRelation96.getTree());

            pushFollow(FOLLOW_attribNumInstance_in_attribConstraint1213);
            attribNumInstance97=attribNumInstance();

            state._fsp--;

            adaptor.addChild(root_0, attribNumInstance97.getTree());

            // Velvet.g:189:22: ( attribOperator attribNumInstance )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==MINUS||LA28_0==PLUS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Velvet.g:189:23: attribOperator attribNumInstance
            	    {
            	    pushFollow(FOLLOW_attribOperator_in_attribConstraint1216);
            	    attribOperator98=attribOperator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribOperator98.getTree());

            	    pushFollow(FOLLOW_attribNumInstance_in_attribConstraint1218);
            	    attribNumInstance99=attribNumInstance();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribNumInstance99.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribConstraint"


    public static class attribOperator_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribOperator"
    // Velvet.g:192:1: attribOperator : ( PLUS | MINUS );
    public final VelvetParser.attribOperator_return attribOperator() throws RecognitionException {
        VelvetParser.attribOperator_return retval = new VelvetParser.attribOperator_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set100=null;

        Tree set100_tree=null;

        try {
            // Velvet.g:193:2: ( PLUS | MINUS )
            // Velvet.g:
            {
            root_0 = (Tree)adaptor.nil();


            set100=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(set100)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribOperator"


    public static class attribNumInstance_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribNumInstance"
    // Velvet.g:197:1: attribNumInstance : ( INT | name );
    public final VelvetParser.attribNumInstance_return attribNumInstance() throws RecognitionException {
        VelvetParser.attribNumInstance_return retval = new VelvetParser.attribNumInstance_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token INT101=null;
        VelvetParser.name_return name102 =null;


        Tree INT101_tree=null;

        try {
            // Velvet.g:198:2: ( INT | name )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==INT) ) {
                alt29=1;
            }
            else if ( ((LA29_0 >= ID && LA29_0 <= IDPath)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // Velvet.g:198:4: INT
                    {
                    root_0 = (Tree)adaptor.nil();


                    INT101=(Token)match(input,INT,FOLLOW_INT_in_attribNumInstance1250); 
                    INT101_tree = 
                    (Tree)adaptor.create(INT101)
                    ;
                    adaptor.addChild(root_0, INT101_tree);


                    }
                    break;
                case 2 :
                    // Velvet.g:200:4: name
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_name_in_attribNumInstance1257);
                    name102=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name102.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribNumInstance"


    public static class attribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute"
    // Velvet.g:203:1: attribute : ( intAttribute | floatAttribute | stringAttribute | boolAttribute ) SEMI -> ^( ATTR ( intAttribute )? ( floatAttribute )? ( stringAttribute )? ( boolAttribute )? ) ;
    public final VelvetParser.attribute_return attribute() throws RecognitionException {
        VelvetParser.attribute_return retval = new VelvetParser.attribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token SEMI107=null;
        VelvetParser.intAttribute_return intAttribute103 =null;

        VelvetParser.floatAttribute_return floatAttribute104 =null;

        VelvetParser.stringAttribute_return stringAttribute105 =null;

        VelvetParser.boolAttribute_return boolAttribute106 =null;


        Tree SEMI107_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_intAttribute=new RewriteRuleSubtreeStream(adaptor,"rule intAttribute");
        RewriteRuleSubtreeStream stream_stringAttribute=new RewriteRuleSubtreeStream(adaptor,"rule stringAttribute");
        RewriteRuleSubtreeStream stream_floatAttribute=new RewriteRuleSubtreeStream(adaptor,"rule floatAttribute");
        RewriteRuleSubtreeStream stream_boolAttribute=new RewriteRuleSubtreeStream(adaptor,"rule boolAttribute");
        try {
            // Velvet.g:204:2: ( ( intAttribute | floatAttribute | stringAttribute | boolAttribute ) SEMI -> ^( ATTR ( intAttribute )? ( floatAttribute )? ( stringAttribute )? ( boolAttribute )? ) )
            // Velvet.g:204:4: ( intAttribute | floatAttribute | stringAttribute | boolAttribute ) SEMI
            {
            // Velvet.g:204:4: ( intAttribute | floatAttribute | stringAttribute | boolAttribute )
            int alt30=4;
            switch ( input.LA(1) ) {
            case VAR_INT:
                {
                alt30=1;
                }
                break;
            case VAR_FLOAT:
                {
                alt30=2;
                }
                break;
            case VAR_STRING:
                {
                alt30=3;
                }
                break;
            case VAR_BOOL:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // Velvet.g:204:5: intAttribute
                    {
                    pushFollow(FOLLOW_intAttribute_in_attribute1269);
                    intAttribute103=intAttribute();

                    state._fsp--;

                    stream_intAttribute.add(intAttribute103.getTree());

                    }
                    break;
                case 2 :
                    // Velvet.g:204:20: floatAttribute
                    {
                    pushFollow(FOLLOW_floatAttribute_in_attribute1273);
                    floatAttribute104=floatAttribute();

                    state._fsp--;

                    stream_floatAttribute.add(floatAttribute104.getTree());

                    }
                    break;
                case 3 :
                    // Velvet.g:204:37: stringAttribute
                    {
                    pushFollow(FOLLOW_stringAttribute_in_attribute1277);
                    stringAttribute105=stringAttribute();

                    state._fsp--;

                    stream_stringAttribute.add(stringAttribute105.getTree());

                    }
                    break;
                case 4 :
                    // Velvet.g:204:55: boolAttribute
                    {
                    pushFollow(FOLLOW_boolAttribute_in_attribute1281);
                    boolAttribute106=boolAttribute();

                    state._fsp--;

                    stream_boolAttribute.add(boolAttribute106.getTree());

                    }
                    break;

            }


            SEMI107=(Token)match(input,SEMI,FOLLOW_SEMI_in_attribute1284);  
            stream_SEMI.add(SEMI107);


            // AST REWRITE
            // elements: boolAttribute, stringAttribute, intAttribute, floatAttribute
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 205:2: -> ^( ATTR ( intAttribute )? ( floatAttribute )? ( stringAttribute )? ( boolAttribute )? )
            {
                // Velvet.g:205:5: ^( ATTR ( intAttribute )? ( floatAttribute )? ( stringAttribute )? ( boolAttribute )? )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(ATTR, "ATTR")
                , root_1);

                // Velvet.g:205:12: ( intAttribute )?
                if ( stream_intAttribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_intAttribute.nextTree());

                }
                stream_intAttribute.reset();

                // Velvet.g:205:26: ( floatAttribute )?
                if ( stream_floatAttribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_floatAttribute.nextTree());

                }
                stream_floatAttribute.reset();

                // Velvet.g:205:42: ( stringAttribute )?
                if ( stream_stringAttribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_stringAttribute.nextTree());

                }
                stream_stringAttribute.reset();

                // Velvet.g:205:59: ( boolAttribute )?
                if ( stream_boolAttribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_boolAttribute.nextTree());

                }
                stream_boolAttribute.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute"


    public static class intAttribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intAttribute"
    // Velvet.g:208:1: intAttribute : VAR_INT ! name ( EQ ! INT )? ;
    public final VelvetParser.intAttribute_return intAttribute() throws RecognitionException {
        VelvetParser.intAttribute_return retval = new VelvetParser.intAttribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token VAR_INT108=null;
        Token EQ110=null;
        Token INT111=null;
        VelvetParser.name_return name109 =null;


        Tree VAR_INT108_tree=null;
        Tree EQ110_tree=null;
        Tree INT111_tree=null;

        try {
            // Velvet.g:208:13: ( VAR_INT ! name ( EQ ! INT )? )
            // Velvet.g:208:16: VAR_INT ! name ( EQ ! INT )?
            {
            root_0 = (Tree)adaptor.nil();


            VAR_INT108=(Token)match(input,VAR_INT,FOLLOW_VAR_INT_in_intAttribute1313); 

            pushFollow(FOLLOW_name_in_intAttribute1316);
            name109=name();

            state._fsp--;

            adaptor.addChild(root_0, name109.getTree());

            // Velvet.g:208:30: ( EQ ! INT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==EQ) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Velvet.g:208:31: EQ ! INT
                    {
                    EQ110=(Token)match(input,EQ,FOLLOW_EQ_in_intAttribute1319); 

                    INT111=(Token)match(input,INT,FOLLOW_INT_in_intAttribute1322); 
                    INT111_tree = 
                    (Tree)adaptor.create(INT111)
                    ;
                    adaptor.addChild(root_0, INT111_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "intAttribute"


    public static class floatAttribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "floatAttribute"
    // Velvet.g:209:1: floatAttribute : VAR_FLOAT ! name ( EQ ! FLOAT )? ;
    public final VelvetParser.floatAttribute_return floatAttribute() throws RecognitionException {
        VelvetParser.floatAttribute_return retval = new VelvetParser.floatAttribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token VAR_FLOAT112=null;
        Token EQ114=null;
        Token FLOAT115=null;
        VelvetParser.name_return name113 =null;


        Tree VAR_FLOAT112_tree=null;
        Tree EQ114_tree=null;
        Tree FLOAT115_tree=null;

        try {
            // Velvet.g:209:15: ( VAR_FLOAT ! name ( EQ ! FLOAT )? )
            // Velvet.g:209:18: VAR_FLOAT ! name ( EQ ! FLOAT )?
            {
            root_0 = (Tree)adaptor.nil();


            VAR_FLOAT112=(Token)match(input,VAR_FLOAT,FOLLOW_VAR_FLOAT_in_floatAttribute1331); 

            pushFollow(FOLLOW_name_in_floatAttribute1334);
            name113=name();

            state._fsp--;

            adaptor.addChild(root_0, name113.getTree());

            // Velvet.g:209:34: ( EQ ! FLOAT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==EQ) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Velvet.g:209:35: EQ ! FLOAT
                    {
                    EQ114=(Token)match(input,EQ,FOLLOW_EQ_in_floatAttribute1337); 

                    FLOAT115=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_floatAttribute1340); 
                    FLOAT115_tree = 
                    (Tree)adaptor.create(FLOAT115)
                    ;
                    adaptor.addChild(root_0, FLOAT115_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "floatAttribute"


    public static class stringAttribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringAttribute"
    // Velvet.g:210:1: stringAttribute : VAR_STRING ! name ( EQ ! STRING )? ;
    public final VelvetParser.stringAttribute_return stringAttribute() throws RecognitionException {
        VelvetParser.stringAttribute_return retval = new VelvetParser.stringAttribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token VAR_STRING116=null;
        Token EQ118=null;
        Token STRING119=null;
        VelvetParser.name_return name117 =null;


        Tree VAR_STRING116_tree=null;
        Tree EQ118_tree=null;
        Tree STRING119_tree=null;

        try {
            // Velvet.g:210:16: ( VAR_STRING ! name ( EQ ! STRING )? )
            // Velvet.g:210:18: VAR_STRING ! name ( EQ ! STRING )?
            {
            root_0 = (Tree)adaptor.nil();


            VAR_STRING116=(Token)match(input,VAR_STRING,FOLLOW_VAR_STRING_in_stringAttribute1348); 

            pushFollow(FOLLOW_name_in_stringAttribute1351);
            name117=name();

            state._fsp--;

            adaptor.addChild(root_0, name117.getTree());

            // Velvet.g:210:35: ( EQ ! STRING )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==EQ) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Velvet.g:210:36: EQ ! STRING
                    {
                    EQ118=(Token)match(input,EQ,FOLLOW_EQ_in_stringAttribute1354); 

                    STRING119=(Token)match(input,STRING,FOLLOW_STRING_in_stringAttribute1357); 
                    STRING119_tree = 
                    (Tree)adaptor.create(STRING119)
                    ;
                    adaptor.addChild(root_0, STRING119_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stringAttribute"


    public static class boolAttribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolAttribute"
    // Velvet.g:211:1: boolAttribute : VAR_BOOL ! name ( EQ ! BOOLEAN )? ;
    public final VelvetParser.boolAttribute_return boolAttribute() throws RecognitionException {
        VelvetParser.boolAttribute_return retval = new VelvetParser.boolAttribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token VAR_BOOL120=null;
        Token EQ122=null;
        Token BOOLEAN123=null;
        VelvetParser.name_return name121 =null;


        Tree VAR_BOOL120_tree=null;
        Tree EQ122_tree=null;
        Tree BOOLEAN123_tree=null;

        try {
            // Velvet.g:211:14: ( VAR_BOOL ! name ( EQ ! BOOLEAN )? )
            // Velvet.g:211:17: VAR_BOOL ! name ( EQ ! BOOLEAN )?
            {
            root_0 = (Tree)adaptor.nil();


            VAR_BOOL120=(Token)match(input,VAR_BOOL,FOLLOW_VAR_BOOL_in_boolAttribute1366); 

            pushFollow(FOLLOW_name_in_boolAttribute1369);
            name121=name();

            state._fsp--;

            adaptor.addChild(root_0, name121.getTree());

            // Velvet.g:211:32: ( EQ ! BOOLEAN )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==EQ) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Velvet.g:211:33: EQ ! BOOLEAN
                    {
                    EQ122=(Token)match(input,EQ,FOLLOW_EQ_in_boolAttribute1372); 

                    BOOLEAN123=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolAttribute1375); 
                    BOOLEAN123_tree = 
                    (Tree)adaptor.create(BOOLEAN123)
                    ;
                    adaptor.addChild(root_0, BOOLEAN123_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolAttribute"


    public static class unaryOp_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryOp"
    // Velvet.g:213:1: unaryOp : OP_NOT ;
    public final VelvetParser.unaryOp_return unaryOp() throws RecognitionException {
        VelvetParser.unaryOp_return retval = new VelvetParser.unaryOp_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token OP_NOT124=null;

        Tree OP_NOT124_tree=null;

        try {
            // Velvet.g:214:2: ( OP_NOT )
            // Velvet.g:214:4: OP_NOT
            {
            root_0 = (Tree)adaptor.nil();


            OP_NOT124=(Token)match(input,OP_NOT,FOLLOW_OP_NOT_in_unaryOp1387); 
            OP_NOT124_tree = 
            (Tree)adaptor.create(OP_NOT124)
            ;
            adaptor.addChild(root_0, OP_NOT124_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unaryOp"


    public static class binaryOp_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "binaryOp"
    // Velvet.g:217:1: binaryOp : ( OP_AND | OP_OR | OP_XOR | OP_IMPLIES | OP_EQUIVALENT );
    public final VelvetParser.binaryOp_return binaryOp() throws RecognitionException {
        VelvetParser.binaryOp_return retval = new VelvetParser.binaryOp_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set125=null;

        Tree set125_tree=null;

        try {
            // Velvet.g:218:2: ( OP_AND | OP_OR | OP_XOR | OP_IMPLIES | OP_EQUIVALENT )
            // Velvet.g:
            {
            root_0 = (Tree)adaptor.nil();


            set125=(Token)input.LT(1);

            if ( (input.LA(1) >= OP_AND && input.LA(1) <= OP_IMPLIES)||(input.LA(1) >= OP_OR && input.LA(1) <= OP_XOR) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(set125)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "binaryOp"


    public static class attribRelation_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribRelation"
    // Velvet.g:225:1: attribRelation : ( ATTR_OP_EQUALS | ATTR_OP_GREATER_EQ | ATTR_OP_LESS_EQ );
    public final VelvetParser.attribRelation_return attribRelation() throws RecognitionException {
        VelvetParser.attribRelation_return retval = new VelvetParser.attribRelation_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set126=null;

        Tree set126_tree=null;

        try {
            // Velvet.g:226:2: ( ATTR_OP_EQUALS | ATTR_OP_GREATER_EQ | ATTR_OP_LESS_EQ )
            // Velvet.g:
            {
            root_0 = (Tree)adaptor.nil();


            set126=(Token)input.LT(1);

            if ( input.LA(1)==ATTR_OP_EQUALS||input.LA(1)==ATTR_OP_GREATER_EQ||input.LA(1)==ATTR_OP_LESS_EQ ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(set126)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribRelation"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\22\uffff";
    static final String DFA4_eofS =
        "\1\3\5\uffff\1\12\1\15\10\uffff\1\12\1\15";
    static final String DFA4_minS =
        "\1\44\2\42\1\uffff\2\42\2\22\1\42\2\uffff\1\42\2\uffff\2\42\2\22";
    static final String DFA4_maxS =
        "\1\71\2\42\1\uffff\2\43\2\71\1\42\2\uffff\1\42\2\uffff\2\43\2\71";
    static final String DFA4_acceptS =
        "\3\uffff\1\5\5\uffff\1\1\1\4\1\uffff\1\2\1\3\4\uffff";
    static final String DFA4_specialS =
        "\22\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\23\uffff\1\3",
            "\1\4",
            "\1\5",
            "",
            "\2\6",
            "\2\7",
            "\1\10\22\uffff\1\11\23\uffff\1\12",
            "\1\13\21\uffff\1\14\24\uffff\1\15",
            "\1\16",
            "",
            "",
            "\1\17",
            "",
            "",
            "\2\20",
            "\2\21",
            "\1\10\22\uffff\1\11\23\uffff\1\12",
            "\1\13\21\uffff\1\14\24\uffff\1\15"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "87:27: ( instanceImports interfaceImports | interfaceImports instanceImports | interfaceImports | instanceImports )?";
        }
    }
 

    public static final BitSet FOLLOW_concept_in_velvetModel474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_cinterface_in_velvetModel476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_velvetModel479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONCEPT_in_concept492 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_concept494 = new BitSet(new long[]{0x0200003000020402L});
    public static final BitSet FOLLOW_ATTR_OP_LESS_in_concept501 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_conceptBaseSpec_in_concept503 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_definitionsSpec_in_concept505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_concept513 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_conceptBaseExt_in_concept515 = new BitSet(new long[]{0x0200003000000002L});
    public static final BitSet FOLLOW_instanceImports_in_concept520 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_interfaceImports_in_concept522 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_interfaceImports_in_concept526 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_instanceImports_in_concept528 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_interfaceImports_in_concept532 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_instanceImports_in_concept536 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_definitions_in_concept543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_conceptBaseExt580 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_conceptBaseExt583 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_conceptBaseExt585 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_conceptBaseSpec610 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_conceptBaseSpec613 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_conceptBaseSpec615 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IMPORTINSTANCE_in_instanceImports639 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_instanceImports641 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_instanceImports643 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_instanceImports646 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_instanceImports648 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_instanceImports650 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IMPORTINTERFACE_in_interfaceImports679 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_interfaceImports681 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_interfaceImports683 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_interfaceImports686 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_interfaceImports688 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_interfaceImports690 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_CINTERFACE_in_cinterface717 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_cinterface719 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_COLON_in_cinterface723 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_interfaceBaseExt_in_cinterface725 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_definitions_in_cinterface729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_interfaceBaseExt756 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_interfaceBaseExt759 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_interfaceBaseExt761 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_START_C_in_definitions801 = new BitSet(new long[]{0x4100220041200010L,0x000000000000000FL});
    public static final BitSet FOLLOW_definition_in_definitions803 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_END_C_in_definitions805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_C_in_definitionsSpec828 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_constraint_in_definitionsSpec830 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_END_C_in_definitionsSpec833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonFeatureDefinition_in_definition857 = new BitSet(new long[]{0x4100220040200012L,0x000000000000000FL});
    public static final BitSet FOLLOW_featureGroup_in_definition865 = new BitSet(new long[]{0x4000000000200002L,0x000000000000000FL});
    public static final BitSet FOLLOW_nonFeatureDefinition_in_definition867 = new BitSet(new long[]{0x4000000000200002L,0x000000000000000FL});
    public static final BitSet FOLLOW_feature_in_definition876 = new BitSet(new long[]{0x4000020040200012L,0x000000000000000FL});
    public static final BitSet FOLLOW_feature_in_definition879 = new BitSet(new long[]{0x4000020040200012L,0x000000000000000FL});
    public static final BitSet FOLLOW_nonFeatureDefinition_in_definition883 = new BitSet(new long[]{0x4000020040200012L,0x000000000000000FL});
    public static final BitSet FOLLOW_constraint_in_nonFeatureDefinition905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_use_in_nonFeatureDefinition910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_nonFeatureDefinition915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_use927 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_use929 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMI_in_use931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MANDATORY_in_feature952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ABSTRACT_in_feature954 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ABSTRACT_in_feature958 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_MANDATORY_in_feature960 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_MANDATORY_in_feature964 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ABSTRACT_in_feature968 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_FEATURE_in_feature975 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_feature977 = new BitSet(new long[]{0x0240000000000000L});
    public static final BitSet FOLLOW_definitions_in_feature980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_feature984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupType_in_featureGroup1015 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_START_C_in_featureGroup1017 = new BitSet(new long[]{0x0000020040000010L});
    public static final BitSet FOLLOW_feature_in_featureGroup1019 = new BitSet(new long[]{0x0000020041000010L});
    public static final BitSet FOLLOW_END_C_in_featureGroup1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint1063 = new BitSet(new long[]{0x0404008C00000000L});
    public static final BitSet FOLLOW_ID_in_constraint1067 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQ_in_constraint1069 = new BitSet(new long[]{0x0404008C00000000L});
    public static final BitSet FOLLOW_constraintDefinition_in_constraint1075 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_attributeConstraint_in_constraint1079 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMI_in_constraint1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraintOperand_in_constraintDefinition1095 = new BitSet(new long[]{0x001B800000000002L});
    public static final BitSet FOLLOW_binaryOp_in_constraintDefinition1098 = new BitSet(new long[]{0x0404000C00000000L});
    public static final BitSet FOLLOW_constraintOperand_in_constraintDefinition1100 = new BitSet(new long[]{0x001B800000000002L});
    public static final BitSet FOLLOW_unaryOp_in_constraintOperand1127 = new BitSet(new long[]{0x0404000C00000000L});
    public static final BitSet FOLLOW_START_R_in_constraintOperand1131 = new BitSet(new long[]{0x0404000C00000000L});
    public static final BitSet FOLLOW_constraintDefinition_in_constraintOperand1133 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_END_R_in_constraintOperand1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_constraintOperand1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribConstraint_in_attributeConstraint1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribNumInstance_in_attribConstraint1194 = new BitSet(new long[]{0x0020040000000A80L});
    public static final BitSet FOLLOW_attribOperator_in_attribConstraint1197 = new BitSet(new long[]{0x0000008C00000000L});
    public static final BitSet FOLLOW_attribNumInstance_in_attribConstraint1199 = new BitSet(new long[]{0x0020040000000A80L});
    public static final BitSet FOLLOW_attribRelation_in_attribConstraint1207 = new BitSet(new long[]{0x0000008C00000000L});
    public static final BitSet FOLLOW_attribNumInstance_in_attribConstraint1213 = new BitSet(new long[]{0x0020040000000002L});
    public static final BitSet FOLLOW_attribOperator_in_attribConstraint1216 = new BitSet(new long[]{0x0000008C00000000L});
    public static final BitSet FOLLOW_attribNumInstance_in_attribConstraint1218 = new BitSet(new long[]{0x0020040000000002L});
    public static final BitSet FOLLOW_INT_in_attribNumInstance1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_attribNumInstance1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intAttribute_in_attribute1269 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_floatAttribute_in_attribute1273 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_stringAttribute_in_attribute1277 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_boolAttribute_in_attribute1281 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEMI_in_attribute1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_INT_in_intAttribute1313 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_intAttribute1316 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_EQ_in_intAttribute1319 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_intAttribute1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_FLOAT_in_floatAttribute1331 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_floatAttribute1334 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_EQ_in_floatAttribute1337 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_FLOAT_in_floatAttribute1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_STRING_in_stringAttribute1348 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_stringAttribute1351 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_EQ_in_stringAttribute1354 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_STRING_in_stringAttribute1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_BOOL_in_boolAttribute1366 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_boolAttribute1369 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_EQ_in_boolAttribute1372 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolAttribute1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_in_unaryOp1387 = new BitSet(new long[]{0x0000000000000002L});

}